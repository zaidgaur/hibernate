 package com.zaid.hibernate_demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.zaid.hibernate_demo.entity.EmployeeDTO;

public class EmployeeDAO {

	public static void main(String[] args) {
		           Configuration cfg = new Configuration();
		           cfg.configure();
		           SessionFactory factory = cfg.buildSessionFactory();
		           Session session = factory.openSession();
                   EmployeeDTO dto = new EmployeeDTO();
                   dto.setId(104);
                   dto.setName("jhonny");
                   dto.setDesignation("developer");
                   dto.setSalary(65000.00);
                   session.save(dto);
		           Transaction transaction = session.beginTransaction();
		          Query cq = session.createQuery("from EmployeeDTO where id=104 ");
		          EmployeeDTO dto1 = (EmployeeDTO)cq.uniqueResult();
		          System.out.println(dto1.getName()+" "+dto1.getDesignation()+" "+dto1.getSalary());
		          transaction.commit();
		          session.close();
		          
		          
		          
                  
                   
	}

}
