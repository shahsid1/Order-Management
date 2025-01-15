package com.register.main;

import java.util.Scanner;

import com.register.dao.RegisterDao;
import com.register.daoimplementation.RegisterImplementation;
import com.register.model.RegisterModel;

public class RegisterMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------Welcome for Registration-------------");
		System.out.println("Enter Your Name");
		String name = scan.nextLine();
		System.out.println("________________________");
		System.out.println("Enter Your Email");
		String email = scan.nextLine();
		System.out.println("________________________");
		System.out.println("Enter Your Password");
		String password = scan.nextLine();
		System.out.println("________________________");
		System.out.println("Enter Your Mobile Number");
		Long mobileNumber = scan.nextLong();
		System.out.println("________________________");
		System.out.println("Enter Your Resturant Name");
		scan.nextLine();
		String resturantName = scan.next();
		System.out.println("________________________");

		RegisterModel registerModel = new RegisterModel(name , email, password, mobileNumber, resturantName);
	 	RegisterDao registerImplementation =new RegisterImplementation();
	 	int status = registerImplementation.insert(registerModel);
	 	if(status==1) {
	 		System.out.println(" ** Thank You for Registration ** ");
	 		System.out.println(" ** Registered Successfully **");
	 	}else {
	 		System.out.println(" **Registration was unsuccessful ** ");
	 		System.out.println(" **Please try again after some time ** ");
	 	
	 	}
		
		
	}

}
