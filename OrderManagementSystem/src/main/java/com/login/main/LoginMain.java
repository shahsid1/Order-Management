package com.login.main;

import java.util.Scanner;

import com.login.daoimplementation.LoginImplementation;
import com.login.model.LoginModel;
import com.tablecount.main.TableCountMain;

public class LoginMain {

	public static void loginModel() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("----------------Welcome for Login-------------");
		System.out.println("Enter Your Mobile Number");
		Long mobileNumber = scan.nextLong();
		scan.nextLine();
		System.out.println("________________________");
		System.out.println("Enter Your Password");
		String password = scan.nextLine();
		System.out.println("________________________");
		
		LoginModel loginModel = new LoginModel(mobileNumber , password);
		LoginImplementation loginImplementation= new LoginImplementation();
		String passwordFromDatabase = loginImplementation.fetchOnMobileNumber(loginModel);
		
		if(password.equals(passwordFromDatabase)) {
			System.out.println(" ** Login Successfull **");
			
			
			
		}else {
			System.out.println(" ** Wrong Mobile Number or Password");
		}
		
	}
	
	
}
