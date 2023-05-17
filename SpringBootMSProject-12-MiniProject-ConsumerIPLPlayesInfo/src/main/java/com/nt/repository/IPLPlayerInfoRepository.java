package com.nt.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.IPLPlayerInfo;

public interface IPLPlayerInfoRepository extends JpaRepository<IPLPlayerInfo, Serializable> {

}
