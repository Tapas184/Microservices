package com.nt.service;

import java.util.List;

import com.nt.model.IPLTeamInfo;

public interface IPLTeamInfoInterface {
	//for team register in data base
	public String teamRegistration(IPLTeamInfo team);
//for get the team with team id
	public IPLTeamInfo getTeam(Integer id);
	//get all Team 
	public List<IPLTeamInfo> getAllTeamDetails();
}//Interface end IPLTeamInfoInterface
