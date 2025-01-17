package com.tablecount.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.tablecount.daoimplementation.TableCountImplementation;
import com.tablecount.model.TableCountModel;

public class TableCountMain {

	private static int statusInsert;
	private static ArrayList<TableCountModel> tableList;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.To add the table - Add \n2.To Display the table - shows" );
		String choose = scan.nextLine();
		TableCountImplementation tableCountImplementation = new TableCountImplementation();
		
		if(choose.equalsIgnoreCase("add")) {
			System.out.println("Enter the number of tables");
			int tableCount=scan.nextInt();
			
				for(int i=1;i<=tableCount;i++) {
					TableCountModel tableCountModel = new TableCountModel(i , "Unoccupied");
					statusInsert = tableCountImplementation.insert(tableCountModel);
				}	
				if(statusInsert==1) {
					System.out.println("Success");
				}else{
					System.out.println("failure");
				}	
		}else if(choose.equalsIgnoreCase("show")){
			
			tableList = tableCountImplementation.fetchStatus();
			System.out.println(tableList);
			
		}
		
	}

}
