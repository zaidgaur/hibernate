package com.zaid.hibernate_assignment.manager;

import java.util.Scanner;

import com.zaid.hibernate_assignment.dao.AsgnDAO;

public class Controller {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("please enter the choice you want to select");
		System.out.println("enter 1 for login and 2 for registration");
	    int choice=scanner.nextInt();
	    switch(choice){
	    case 1: AsgnDAO.login();
	    break;
	    case 2: AsgnDAO.registration();
	    break;
	    default: System.out.println("sorry you enter the wrong number try again");
	    break;
	    }
		
	}

}
