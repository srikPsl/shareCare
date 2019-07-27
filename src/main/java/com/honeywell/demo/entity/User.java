package com.honeywell.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer userId;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "locality")
	private String locality;
	
	

	

}
