package com.zaid.hibernate_assignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
@Data
@Entity
public class CustomerDTO {
	@Id
	@GeneratedValue(generator="auto")
	@GenericGenerator(name="auto" , strategy="increment")
	private int id ;
	private String userName;
	private String fullName;
	private String password;
	private long phoneNumber;
	private String address;
	
	

}
