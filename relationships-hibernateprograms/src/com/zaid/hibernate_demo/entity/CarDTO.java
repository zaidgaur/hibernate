package com.zaid.hibernate_demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class CarDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cId;
	private String cName;
	@OneToOne(cascade=CascadeType.ALL)
	private EngineDTO engDto;
	

}
