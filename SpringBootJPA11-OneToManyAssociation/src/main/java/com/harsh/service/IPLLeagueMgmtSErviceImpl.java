package com.harsh.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harsh.entity.IPLPlayer;
import com.harsh.entity.IPLTeam;
import com.harsh.repository.IIPLPlayerRepository;
import com.harsh.repository.IIPLTeamRepository;

@Service
public class IPLLeagueMgmtSErviceImpl implements IIPLLeagueMgmtService {

	@Autowired
	private IIPLTeamRepository teamRepo;
	
	@Autowired
	private IIPLPlayerRepository playerRepo;
	
	
	@Override
	public String registerIPLTeam(IPLTeam team) {
		int idVal = teamRepo.save(team).getTid();
		return "Team saved  having palyer with the id value ::"+idVal;
	}

	@Override
	public String registerIPLPlayers(Iterable<IPLPlayer> list) {
		//use repo
		List<IPLPlayer> saveList = playerRepo.saveAll(list);
		// gather only id  values from saved List1
		List<Integer> ids = saveList.stream().map(IPLPlayer::getPid).collect(Collectors.toList());
		return ids.size()+" Players and  their team is saved with id values::"+ids;
	}

	@Override
	public List<IPLTeam> showAllTeamsAndPlayers() {
		List<IPLTeam> all = teamRepo.findAll();
		return all;
	}

	@Override
	public List<IPLPlayer> showAllPalyersAndTeams() {
		List<IPLPlayer> all = playerRepo.findAll();
		return all;
	}

	@Override
	public String deleteTeamItsPlayer(int tid) {
		//Load  Parent object
		IPLTeam dPlayer = teamRepo.findById(tid).orElseThrow(()-> new IllegalArgumentException());
		//delete the parent and its  associated childs
	    teamRepo.delete(dPlayer);
		return tid+" Team and its  players are deleted";
	}

	@Override
	public String deleteAllPlayersAndTheirTeam(int pid1, int pid2) {
		//load  objects
		List<IPLPlayer> dallById = playerRepo.findAllById(List.of(pid1,pid2));
		//delete the child objs
		playerRepo.deleteAll(dallById);
		return dallById.size()+" players and their  respective is  deleted";
	}

	@Override
	public String deleteAllPlayersOfATeam(int tid) {
		//load obj
		IPLTeam team = teamRepo.findById(tid).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		//get all  players of a team
		Set<IPLPlayer> playersChild = team.getPlayers();
		//remove  the link with parent from childs
		playersChild.forEach(ch -> {
			ch.setTeam(null);
		});
		return playersChild.size()+"  no.of players are deleted";
	}

	@Override
	public String deletePlayerFromATeam(int pid, int tid) {
		//Load objs
		IPLTeam team = teamRepo.findById(tid).orElseThrow(()->new IllegalArgumentException("Invalid id"));
		IPLPlayer  player=playerRepo.findById(pid).orElseThrow(()-> new IllegalArgumentException("Inalid id"));

		//nully  Team from the  player
		player.setTeam(null);
		
		playerRepo.save(player);
		playerRepo.delete(player);
		
		return pid+" Player is removed  from"+ tid + "Team";
	}

	@Override
	public String addNewPlayerToTheExistingTeam(IPLPlayer player, int tid) {
		//Load the parent object
		IPLTeam team = teamRepo.findById(tid).orElseThrow(()-> new IllegalArgumentException("Inalid id"));
		
		//get all childs of the parent obj
		Set<IPLPlayer>  players=team.getPlayers();
		
		//link  new Player with  team
		player.setTeam(team);
		
		players.add(player);
		
		//save/update the team
		teamRepo.save(team);
		return tid+" team added with new Player";
	}

}
