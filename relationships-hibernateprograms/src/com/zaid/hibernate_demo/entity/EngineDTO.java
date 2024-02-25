package com.zaid.hibernate_demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class EngineDTO {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int eId ;
	private String eName;
	
	

}
