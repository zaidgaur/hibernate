package com.zaid.hibernate_demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
public class OrClauseDTO {
	@Id
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto",strategy="increment")
	private int id ;
	private String name ;
	private String address;

}
