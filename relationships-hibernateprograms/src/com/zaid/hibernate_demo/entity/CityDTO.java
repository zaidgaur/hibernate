package com.zaid.hibernate_demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;



@Entity
@Data
public class CityDTO {
	@Id
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto", strategy="increment")
	private int ctId;
	private String ctName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="cnId")
	private CountryDTO countryDTO;
	
	

}
