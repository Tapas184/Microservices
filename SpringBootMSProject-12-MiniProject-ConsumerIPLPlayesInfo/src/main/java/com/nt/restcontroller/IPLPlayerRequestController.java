package com.nt.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.IPLPlayerInfo;
import com.nt.service.IPLPlayerInfoInterface;

import feign.Request.HttpMethod;
import lombok.extern.slf4j.Slf4j;

@RestController("IPLPLAyercontroller")
@Slf4j
public class IPLPlayerRequestController {

	@Autowired
	private IPLPlayerInfoInterface service;
	
	@PostMapping("/save")
	public ResponseEntity<String> savePlayer(@RequestBody IPLPlayerInfo player){
		log.info("Entered into consumer-restcontroller-savePlayer");
		String result = service.registerPlayer(player);
		log.info("call the service method");
		return ResponseEntity.ok(result);
	}//end of savePlayer
	
	@GetMapping("/get")
	public ResponseEntity<List<IPLPlayerInfo>> fetchAllPlayer(){
		log.info("Entered into consumer-restcontroller-fetchAllPlayer");
		List<IPLPlayerInfo> list = service.findAllPlayer();
		log.info("Get the list of the player");
		return ResponseEntity.ok(list);
		
	}
	@GetMapping("/player/{id}")
	public ResponseEntity<Object> getPlayerDetails(@PathVariable Integer id){
		log.info("Entered in to consumer-restcontroller-getPlayerDetails");
		Optional<IPLPlayerInfo> player = service.getPlayerById(id);
		if(player.isPresent())
		{
			return ResponseEntity.ok(player.get());
		}
		return new ResponseEntity<>("Player Not Found", HttpStatus.NOT_FOUND);

		
	}
	
}//end of the class IPLPlayerRequestController
