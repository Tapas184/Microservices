package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.model.IPLTeamInfo;
import com.nt.repositry.IPLTeamInfoRepository;

@Service("IPLTeamService")
public class IPLTeamInfoService implements IPLTeamInfoInterface {

	
	private final Logger log = LoggerFactory.getLogger(IPLTeamInfoService.class);
	@Autowired
	IPLTeamInfoRepository teamrepo;

	@Override
	public String teamRegistration(IPLTeamInfo team) {
		log.info("Entered into IPLTeamInfoService class- teamRegistration method");
		// save team in data base
		Integer teamid = teamrepo.save(team).getTeamid();
		log.info("Call the repositry class object");
		return "Team " + team.getTeamname() + " registered with id::" + teamid;
	}

	@Override
	public IPLTeamInfo getTeam(Integer id) {
		log.info("Entered in to Service class getTeam method");
		Optional<IPLTeamInfo> findById = teamrepo.findById(id);
		log.info("call the reposity method and get he Optional class object");
		if (findById.isPresent()) {
			log.info("Team is availabe and return IPLTeamInfo object");
			return findById.get();
		}
		else {
			log.debug("searched ID related IPLTeamInfo object is not availabe");
		return null;
		}//else
	}//end of getTeam(-)

	@Override
	public List<IPLTeamInfo> getAllTeamDetails() {
		log.info("Entered into getAllTeamDetails method in ProducerIPLTeaminfo app");
		return teamrepo.findAll();
	}//end of getAllTeamDetails()

}//end of the class
