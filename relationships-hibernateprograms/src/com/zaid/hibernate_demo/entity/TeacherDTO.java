package com.zaid.hibernate_demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import lombok.Data;
@Entity
@Data
public class TeacherDTO {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int teacherId;
	@Column(name="tName")
    private String teacherName;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(referencedColumnName="teacherId")
	private List<StudentDTO> listofstudent; 
	
	
    
	

}
