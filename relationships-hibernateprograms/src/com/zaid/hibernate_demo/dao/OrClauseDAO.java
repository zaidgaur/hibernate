package com.zaid.hibernate_demo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Restrictions;

import com.zaid.hibernate_demo.entity.OrClauseDTO;

public class OrClauseDAO {

	public static void main(String[] args) {
		Configuration conf=new Configuration();
		  conf.configure();
		  SessionFactory sf = conf.buildSessionFactory();
		  Session session = sf.openSession();
		  OrClauseDTO dto = new OrClauseDTO();
		  dto.setName("sufiyan");
		  dto.setAddress("manki");
		  session.save(dto);
		  Transaction transaction = session.beginTransaction();
		  transaction.commit();
		 //Criteria cr= session.createCriteria(OrClauseDTO.class);
		// cr.add(Restrictions.or(Restrictions.eq("name", "talib"),Restrictions.lt("id", 3)));
//		 Disjunction disjunction = Restrictions.disjunction();
//		 disjunction.add(Restrictions.eq("name", "aleem"));
//		 disjunction.add(Restrictions.eq("address", "nasrullapur"));
//		 cr.add(disjunction);
		  Criteria cr= session.createCriteria(OrClauseDTO.class);
		  cr.add(Restrictions.lt("id", 6));
		  cr.add(Restrictions.eq("address","Deoband" ));
		 List<OrClauseDTO> list = cr.list();
		 for (OrClauseDTO dis : list) {
			 System.out.println(dis.getId()+" "+dis.getName()+" "+dis.getAddress());
			
		}
		 
		 

	}

}
