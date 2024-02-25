package com.zaid.hibernate_demo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.zaid.hibernate_demo.entity.CityDTO;
import com.zaid.hibernate_demo.entity.CountryDTO;

public class ManyToOneDAO {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session session = sf.openSession();
		
		CountryDTO countryDTO=new CountryDTO();
		countryDTO.setCnName("dubai");
		
		CityDTO cityDTO1=new CityDTO();
		cityDTO1.setCtName("muzaffarnagar");
		cityDTO1.setCountryDTO(countryDTO);
		session.save(cityDTO1);
		
		CityDTO cityDTO2=new CityDTO();
		cityDTO2.setCtName("sre");
		cityDTO2.setCountryDTO(countryDTO);
		session.save(cityDTO2);
		
		CityDTO cityDTO3=new CityDTO();
		cityDTO3.setCtName("shamli");
		cityDTO3.setCountryDTO(countryDTO);
		session.save(cityDTO3);
		
		session.beginTransaction().commit();

	}

}
