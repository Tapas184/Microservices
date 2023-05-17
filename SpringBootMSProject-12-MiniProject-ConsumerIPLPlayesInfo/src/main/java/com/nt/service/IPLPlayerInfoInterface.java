package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.model.IPLPlayerInfo;

public interface IPLPlayerInfoInterface {
	public String registerPlayer(IPLPlayerInfo player);
	public List<IPLPlayerInfo> findAllPlayer();
	public Optional<IPLPlayerInfo> getPlayerById(Integer id);

}
