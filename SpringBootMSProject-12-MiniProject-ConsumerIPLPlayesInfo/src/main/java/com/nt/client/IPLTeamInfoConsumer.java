package com.nt.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nt.model.IPLTeamInfo;

@FeignClient("IPLTeam-Service")
public interface IPLTeamInfoConsumer {

	@GetMapping("/searchteam/{id}")
	public ResponseEntity<IPLTeamInfo> findTeamById(@PathVariable Integer id);
	@PostMapping("/register")
	public ResponseEntity<Object> teamRegister(@RequestBody IPLTeamInfo team);
	@GetMapping("/all")
	public ResponseEntity<List<IPLTeamInfo>> allTeamList();
}//end of interface IPLPlayesInfoConsumer
