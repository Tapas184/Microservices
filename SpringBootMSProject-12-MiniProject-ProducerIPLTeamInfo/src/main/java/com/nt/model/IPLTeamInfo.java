package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//Model Class
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "IPL_TEAM_INFO")
public class IPLTeamInfo {

	@Id
	@SequenceGenerator(name = "seq1",sequenceName = "IPL_SEQ_1",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "seq1",strategy = GenerationType.SEQUENCE)
	private Integer teamid;
	@Column(length = 20)
	@NonNull
	private String teamname;
	@Column(length = 20)
	@NonNull
	private String location;
	@Column(length = 20)
	@NonNull
	private String owner;
	@Column(length = 25)
	@NonNull
	private String captain;
}//end of the class
