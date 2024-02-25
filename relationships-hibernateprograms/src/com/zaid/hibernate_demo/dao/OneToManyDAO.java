package com.zaid.hibernate_demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zaid.hibernate_demo.entity.StudentDTO;
import com.zaid.hibernate_demo.entity.TeacherDTO;

public class OneToManyDAO {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		
		StudentDTO st1 = new StudentDTO();
		st1.setStudentName("zaid");
		
		StudentDTO st2 = new StudentDTO();
		st2.setStudentName("jhonny");
		
		StudentDTO st3 = new StudentDTO();
		st3.setStudentName("arun");
		
		List<StudentDTO> listStudentDTOs = new ArrayList<StudentDTO>();
		listStudentDTOs.add(st1);
		listStudentDTOs.add(st2);
		listStudentDTOs.add(st3);
		
		 TeacherDTO teacherDTO = new TeacherDTO();
		 teacherDTO.setTeacherName("azam sir");
		 teacherDTO.setListofstudent(listStudentDTOs);
		 
		 session.save(teacherDTO);
		 Transaction transaction = session.beginTransaction();
		 transaction.commit();
		 
	}

}
