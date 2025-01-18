package com.register.main;

import java.util.Scanner;

import com.login.main.LoginMain;
import com.register.dao.RegisterDao;
import com.register.daoimplementation.RegisterImplementation;
import com.register.model.RegisterModel;

public class RegisterMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.Register \n2.Login \nChoose 1 or 2");
	 	int option = scan.nextInt();
	 	scan.nextLine();
	 	if(option==1) {
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
			scan.nextLine();
			System.out.println("________________________");
			System.out.println("Enter Your Resturant Name");
			String resturantName = scan.nextLine();
			System.out.println("________________________");

			RegisterModel registerModel = new RegisterModel(name , email, password, mobileNumber, resturantName);
		 	RegisterDao registerImplementation =new RegisterImplementation();
		 	int status = registerImplementation.insert(registerModel);
		 	if(status==1) {
		 		System.out.println(" ** Thank You for Registration ** ");
		 		System.out.println(" ** Registered Successfully **");
		 		System.out.println("\n\nDo you want to continue with login? Yes or No");
		 	}else {
		 		System.out.println(" **Registration was unsuccessful ** ");
		 		System.out.println(" **Please try again after some time ** ");
		 	}
			
		 	
		 	String choose = scan.nextLine();
		 	
		 	if(choose.equalsIgnoreCase("yes")) {
		 		LoginMain.loginModel();
		 	}else if(choose.equalsIgnoreCase("no")) {
		 		System.exit(0);
		 	}else {
		 		System.out.println("Choose one of the above");
		 	}
		 	
		 	
	 	}else if(option==2) {
	 		LoginMain.loginModel();
	 		
	 	}else {
	 		System.out.println("Choose one of the above");
	 	}
		
		
		
	}

}
