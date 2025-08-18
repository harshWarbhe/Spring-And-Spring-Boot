package com.harsh.entity;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "JPA_TEAM")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class IPLTeam {

	@Id
	@SequenceGenerator(name = "gen1", sequenceName = "TID_SEQ", initialValue = 1, allocationSize = 1)
	@GeneratedValue(generator = "gen1", strategy = GenerationType.AUTO)
	private Integer tid;

	@NonNull
	@Column(length = 30)
	private String tname;

	@NonNull
	@Column(length = 30)
	private String owner;

	@NonNull
	@Column(length = 30)
	private String captain;

	@OneToMany(targetEntity = IPLPlayer.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "team")
	//@JoinColumn(name = "TEAM_ID", referencedColumnName = "TID")
	private Set<IPLPlayer> players;

	public IPLTeam() {
		super();
		System.out.println("IPLTeam:: 0-param constructor::" + this.getClass());
	}

	@Override
	public String toString() {
		return "IPLTeam [tid=" + tid + ", tname=" + tname + ", owner=" + owner + ", captain=" + captain + ", players="
				+ players + "]";
	}

}
