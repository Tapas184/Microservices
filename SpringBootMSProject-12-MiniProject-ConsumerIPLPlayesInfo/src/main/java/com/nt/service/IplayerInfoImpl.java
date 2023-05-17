package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.client.IPLTeamInfoConsumer;
import com.nt.model.IPLPlayerInfo;
import com.nt.model.IPLTeamInfo;
import com.nt.repository.IPLPlayerInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Service("IPLPlayerservice")
@Slf4j
public class IplayerInfoImpl implements IPLPlayerInfoInterface {

	@Autowired
	private IPLPlayerInfoRepository repo;
	@Autowired
	private IPLTeamInfoConsumer consumer;
	@Override
	public String registerPlayer(IPLPlayerInfo player) {
		log.info("Entered into consumer-service-registerPlayer()");
		IPLTeamInfo team = consumer.findTeamById(player.getTeam().getTeamid()).getBody();
		log.info("Get the team object");
		player.setTeam(team);
		log.info("Set team to the player");
		Integer pid = repo.save(player).getPid();
		log.info("get the player id ");
		return "Player and His team details having the player id:"+pid;
	}

	@Override
	public List<IPLPlayerInfo> findAllPlayer() {
		log.info("Entered into consumer-service-findAllPlayer()");
		repo.findAll();
		return repo.findAll();
	}

	@Override
	public Optional<IPLPlayerInfo> getPlayerById(Integer id) {
		log.info("Entered into consumer-service- getPlayerById()");
		Optional<IPLPlayerInfo> player = repo.findById(id);
		log.info("call the find by id method in service class of consumer");
		return player;
	}

}
