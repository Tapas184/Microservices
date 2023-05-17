package com.nt.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.IPLTeamInfo;
import com.nt.service.IPLTeamInfoInterface;

@RestController("controller")
public class RequestController {

	@Autowired
	private IPLTeamInfoInterface service;
	private final Logger log = LoggerFactory.getLogger(RequestController.class);
	
	@PostMapping("/register")
	public ResponseEntity<String> teamRegister(@RequestBody IPLTeamInfo sourTeam) {
		log.info("Entered into teamRegistration method");
		String result = service.teamRegistration(sourTeam);
		log.info("call service method");
		return ResponseEntity.ok(result);
	}

	@GetMapping("/searchteam/{id}")
	public ResponseEntity<Object> getTeamDetails(@PathVariable("id") Integer id) {
		log.info("Entered into getTeamDetails method");
		// call the service method
		IPLTeamInfo team = service.getTeam(id);
		log.info("call the service method");
		// return response entity
		if (team != null) {
			// check if team is null
			log.info("checking if team is null");
			return new ResponseEntity<>(team, HttpStatus.OK);
		}
		else {
			log.debug("Team object is null");
		return new ResponseEntity<>("Team not availabe", HttpStatus.NO_CONTENT);
		}
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<IPLTeamInfo>> fetchAllTeam(){
		log.info("Entered into produceApp-restcontroller-fetchAllTeam");
		List<IPLTeamInfo> listOfTeam = service.getAllTeamDetails();
		log.info("Service method called for List Of Team");
		return ResponseEntity.ok(listOfTeam);
	}
}// end of the class RequestController
