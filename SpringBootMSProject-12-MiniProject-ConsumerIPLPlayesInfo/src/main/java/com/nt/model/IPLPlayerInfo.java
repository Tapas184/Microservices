package com.nt.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "IPL_PLAYER_INFO")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IPLPlayerInfo {
	
	@Id
	@GeneratedValue
	private Integer pid;
	@Column(length = 20)
	private String pname;
	private Integer jersyno;
	@Column(length = 20)
	private String role;
	@ManyToOne(targetEntity =IPLTeamInfo.class,cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(name = "team_id",referencedColumnName = "teamid")	
	private IPLTeamInfo team;

}//end of the class
