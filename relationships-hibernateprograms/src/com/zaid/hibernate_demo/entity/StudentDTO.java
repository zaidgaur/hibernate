package com.zaid.hibernate_demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;

import lombok.Data;

@Entity
@Data
public class StudentDTO {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
	
}
