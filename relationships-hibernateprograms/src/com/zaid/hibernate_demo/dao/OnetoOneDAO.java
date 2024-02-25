package com.zaid.hibernate_demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zaid.hibernate_demo.entity.CarDTO;
import com.zaid.hibernate_demo.entity.EngineDTO;

public class OnetoOneDAO {

	public static void main(String[] args) {
	  Configuration conf=new Configuration();
	  conf.configure();
	  SessionFactory sf = conf.buildSessionFactory();
	  Session session = sf.openSession();
	  EngineDTO engDto = new EngineDTO();
	  engDto.setEName("four cylinder engine ");
	  
	  CarDTO carDTO = new CarDTO();
      carDTO.setCName("safari");
	  carDTO.setEngDto(engDto);
	  
	  session.save(carDTO);
	  Transaction transaction = session.beginTransaction();
	  transaction.commit();
	  session.close();
	  

	}

}
