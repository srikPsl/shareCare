package com.honeywell.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "map_user_group",schema="app")

public class MapUserGrp {

	@Id
	@GeneratedValue
	@Column(name = "mugid")
	private Integer mugId;
	
	
	@ManyToOne
	@JoinColumn(name = "grp")
	
	private Grp group;
	
	@ManyToOne
	@JoinColumn(name = "user")
	private User user;
	
	
}
