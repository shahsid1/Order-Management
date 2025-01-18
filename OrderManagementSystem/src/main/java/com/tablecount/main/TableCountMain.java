package com.tablecount.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.tablecount.daoimplementation.TableCountImplementation;
import com.tablecount.model.TableCountModel;

public class TableCountMain {

	private static int statusInsert;
	private static ArrayList<TableCountModel> tableList;

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		System.out.println("1.To add the table \n2.To Display the table " );
		int choose = scan.nextInt();
		TableCountImplementation tableCountImplementation = new TableCountImplementation();

		if(choose==1) {

			System.out.println("1. Add tables to existing list \n2.Add new tables");
			int option = scan.nextInt();

			if(option==1) {
				
				System.out.println("Existing Tables are");
				tableList = tableCountImplementation.fetchStatus();
				System.out.println(tableList);
				
				System.out.println();
				
				
			}
			
			else if(option==2){
				
				int status = tableCountImplementation.truncate();
				
				System.out.println("Enter the number of tables");
				int tableCount=scan.nextInt();

				for(int i=1;i<=tableCount;i++) {
					TableCountModel tableCountModel = new TableCountModel(i , "Unoccupied");
					statusInsert = tableCountImplementation.insert(tableCountModel);
				}	

				if(statusInsert==1) {
					System.out.println("Success");
				}
				else{
					System.out.println("failure");
				}	
			}
			
			else {
				System.out.println("Choose the correct option");
			}

		}	
		
		else if(choose==2){
			tableList = tableCountImplementation.fetchStatus();
			System.out.println(tableList);
		}
		
		else{
			System.out.println("Enter the correct option");
		}

	}

}
