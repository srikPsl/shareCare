package com.honeywell.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "map_user_group")

public class MapUserGroup {

	@Id
	@GeneratedValue
	@Column(name = "mugid")
	private Integer mugId;
	
	
	@Column(name = "group")
	@ManyToMany
	private Group group;
	
	@Column(name = "user")
	@ManyToMany
	private User user;
	
	
}
