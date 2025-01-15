package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static String url="jdbc:mysql://localhost:3306/ordermanagement";
	private static String dbusername="root";
	private static String dbPassword="root";
	static Connection con;
	
	public static Connection connect(){
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url, dbusername, dbPassword);

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
		
	}
	
	
}
