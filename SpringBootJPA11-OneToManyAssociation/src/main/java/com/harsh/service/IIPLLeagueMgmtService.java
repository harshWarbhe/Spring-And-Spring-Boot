package com.harsh.service;

import java.util.List;

import com.harsh.entity.IPLPlayer;
import com.harsh.entity.IPLTeam;

public interface IIPLLeagueMgmtService {

	public String registerIPLTeam(IPLTeam team);

	public String registerIPLPlayers(Iterable<IPLPlayer> list);

	public List<IPLTeam> showAllTeamsAndPlayers();

	public List<IPLPlayer> showAllPalyersAndTeams();

	public String deleteTeamItsPlayer(int tid);

	public String deleteAllPlayersAndTheirTeam(int pid1, int pid2);

	public String deleteAllPlayersOfATeam(int tid);

	public String deletePlayerFromATeam(int pid, int tid);

	public String addNewPlayerToTheExistingTeam(IPLPlayer player, int tid);
}
