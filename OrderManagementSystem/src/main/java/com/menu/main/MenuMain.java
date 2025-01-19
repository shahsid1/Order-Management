package com.menu.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.menu.daoimplementation.MenuImplementation;
import com.menu.model.MenuModel;

class Common{
	static Scanner scan = new Scanner(System.in);
	MenuImplementation menuImplementation = new MenuImplementation();

	static int displayCategory() {
		System.out.println("Select the Category\n1.BreakFast \n2.Lunch \n3.Dinner");
		int chooseCategory = scan.nextInt();
		
		if(chooseCategory>3) {
			System.out.println("Choose correct option");
		}
		return chooseCategory;
	}

	MenuModel insertInformation(){
		scan.nextLine();
		System.out.println("Enter Dish Name");
		String name = scan.nextLine();
		System.out.println("________________________");
		System.out.println("Enter the price of Dish");
		int price = scan.nextInt();
		scan.nextLine();
		System.out.println("________________________");
		System.out.println("Enter the description of dish or press enter");
		String description = scan.nextLine();
		System.out.println("________________________");

		MenuModel menuModel = new MenuModel(name,price,description);
		return menuModel;
	}

	static void insertOption(int option){
		if(option==2) {
			System.out.println("Thank You for adding the items.");
		}else {
			System.out.println("Choose correct option");
		}
	}

	static int insertStatus(int status) {
		if(status==1) {
			System.out.println("Entered Successfully");
		}else {
			System.out.println("Something error occured please try after some time");
			System.exit(0);
		}
		System.out.println("Want to add another item? \n1.Yes \n2.No");
		int option = scan.nextInt();
		return option;
	}

	static MenuModel deleteInformation() {
		scan.nextLine();
		System.out.println("Enter the name of item you want to delete");
		String name=scan.nextLine();
		MenuModel menuModel = new MenuModel(name);
		return menuModel;
	}

	static void deleteOption(int option){	
		if(option==2) {
			System.out.println("Thank You for deleting the items.");
		}else {
			System.out.println("Choose correct option");
		}
	}

	static int deleteStatus(int status){
		if(status==1) {
			System.out.println("Deleted Successfully");
		}else {
			System.out.println("Something error occured please try after some time");
			System.exit(0);
		}
		System.out.println("Want to delete another item? \n1.Yes \n2.No");
		int option = scan.nextInt();
		return option;
	}
}

class BreakFast extends Common{

	void display() {
		System.out.println("List of Breakfast Items");
		ArrayList<MenuModel> breakfastList = menuImplementation.fetchBreakFast();
		System.out.println(breakfastList);
		
	}

	int insert() {
		MenuModel menuModel = insertInformation();
		int status = menuImplementation.insertBreakFast(menuModel);
		int option = Common.insertStatus(status);
		return option;
	}

	int delete() {
		MenuModel menuModel = Common.deleteInformation();
		int status = menuImplementation.deleteBreakFast(menuModel);
		int option = Common.deleteStatus(status);	
		return option;
	}
}

class Lunch extends Common{
	void display() {
		System.out.println("List of Lunch Items");
		ArrayList<MenuModel> lunchList = menuImplementation.fetchLunch();
		System.out.println(lunchList);
	}

	int insert() {
		MenuModel menuModel = insertInformation();
		int status = menuImplementation.insertLunch(menuModel);
		int option = Common.insertStatus(status);
		return option;
	}

	int delete() {
		MenuModel menuModel = Common.deleteInformation();
		int status = menuImplementation.deleteLunch(menuModel);
		int option = Common.deleteStatus(status);	
		return option;
	}
}

class Dinner extends Common{
	void display() {
		System.out.println("List of Dinner Items");
		ArrayList<MenuModel> lunchList = menuImplementation.fetchDinner();
		System.out.println(lunchList);
	}

	int insert() {
		MenuModel menuModel = insertInformation();
		int status = menuImplementation.insertDinner(menuModel);
		int option = Common.insertStatus(status);
		return option;
	}

	int delete() {
		MenuModel menuModel = Common.deleteInformation();
		int status = menuImplementation.deleteDinner(menuModel);
		int option = Common.deleteStatus(status);	
		return option;
	}	
}

public class MenuMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		BreakFast breakfast = new BreakFast();
		Lunch lunch = new Lunch();
		Dinner dinner = new Dinner();

		System.out.println("1.Show Menu \n2.Add Item \n3.Delete Item");
		int choose = scan.nextInt();

		if(choose==1) {

			breakfast.display();
			lunch.display();
			dinner.display();

		}else if(choose==2) {

			int chooseCategory = Common.displayCategory();
			int option;

			switch(chooseCategory) {
			case 1:
				do {
					option = breakfast.insert();
				}while(option==1);
				Common.insertOption(option);
				break;

			case 2:do {
				option = lunch.insert();
			}while(option==1);
			Common.insertOption(option); 
			break;

			case 3:do {
				option = dinner.insert();
			}while(option==1);
			Common.insertOption(option); 
			break;
			}

		}else if(choose==3) {

			int chooseCategory = Common.displayCategory();
			scan.nextLine();
			int option;

			switch(chooseCategory) {
			case 1: 
				breakfast.display();
				System.out.println();
				do {
					option = breakfast.delete();
				}while(option==1);	
				Common.deleteOption(option);
				break;

			case 2: lunch.display();
			System.out.println();
			do {
				option = lunch.delete();
			}while(option==1);	
			Common.deleteOption(option);
			break;

			case 3:dinner.display();
			System.out.println();
			do {
				option = dinner.delete();
			}while(option==1);	
			Common.deleteOption(option);
			break;
			}

		}else {
			System.out.println("Choose the correct option");
		}

	}

}
