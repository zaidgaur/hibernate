package com.zaid.hibernate_assignment.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.zaid.hibernate_assignment.entity.CustomerDTO;

public class AsgnDAO {
	
	public static Session session(){
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
	
	public static void login(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter your username");
		String user = scanner.next();
		System.out.println("please enter your password");
		scanner.nextLine();
		String password = scanner.nextLine();
		Session session = session();
		Query query = session.createQuery("from CustomerDTO where userName=:name and password=:pass");
		query.setParameter("name",user);
		query.setString("pass", password);
		CustomerDTO ur =(CustomerDTO) query.uniqueResult();
		if(ur!=null){
		System.out.println("login successful,below is the user details");
	    System.out.println("username:"+ur.getUserName()+"   fullName:"+ur.getFullName()+"   password:"+ur.getPassword()+"   address:"+ur.getAddress()+"   phoneNumber:"+ur.getPhoneNumber());
		}else{
			System.out.println("login failed please try again with correct credential");
		}
	   
	}
	
	public static void registration(){
		Session session = session();
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter user name");
		String username = scanner.nextLine();
		System.out.println("enter fullName");
		String fullName = scanner.nextLine();
		System.out.println("enter password you want to create");
		String password = scanner.nextLine();
		System.out.println("enter your address");
		String address = scanner.nextLine();
		System.out.println("enter your phone number");
		long phoneNumber = scanner.nextLong();
		CustomerDTO dto=new CustomerDTO();
		dto.setUserName(username);
		dto.setFullName(fullName);
		dto.setPassword(password);
		dto.setAddress(address);
		dto.setPhoneNumber(phoneNumber);
		session.save(dto);
		Transaction transaction = session.beginTransaction();
		transaction.commit();
		session.close();
		System.out.println("successfully record stored in database table");
	}

}
