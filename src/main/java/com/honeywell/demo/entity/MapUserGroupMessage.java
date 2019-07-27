package com.honeywell.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "map_user_group_message")

public class MapUserGroupMessage {

	@Id
	@GeneratedValue
	@Column(name = "mugMsgId")
	private Integer mugMsgId;
	
	@Column(name = "mug")
	@ManyToMany
	private MapUserGroup mug;
	
	@Column(name = "message")
	private String message ;
	
	@Column(name = "status")
	private String status;
	
	
}
