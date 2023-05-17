package com.nt.repositry;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.model.IPLTeamInfo;

public interface IPLTeamInfoRepository extends JpaRepository<IPLTeamInfo, Serializable> {

}
