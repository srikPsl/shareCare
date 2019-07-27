package com.honeywell.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "map_user_group_message",schema="app")

public class MapUserGrpMessage {

	@Id
	@GeneratedValue
	@Column(name = "mugMsgId")
	private Integer mugMsgId;
	
	@JoinColumn(name = "mug")
	@ManyToOne
	private MapUserGrp mug;
	
	@Column(name = "message")
	private String message ;
	
	@Column(name = "status")
	private String status;
	
	
}
