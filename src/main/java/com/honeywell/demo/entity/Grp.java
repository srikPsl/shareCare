package com.honeywell.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "grp",schema="app")
public class Grp {

	@Id
	@GeneratedValue
	@Column(name = "gid")
	private Integer groupId;
	
	@Column(name = "group_name")
	private String groupName;
	
	@Column(name = "category")
	private String category;
	
}
