package com.login.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connection.DatabaseConnection;
import com.login.dao.LoginDao;
import com.login.model.LoginModel;

public class LoginImplementation implements LoginDao{
	
	private Connection con;
	private String fetchOnMobileNumber="select password from resturantregister where mobileNumber=?";
	private PreparedStatement psmt;
	private ResultSet result=null;
	private String passwordFromDatabase;
	
	public LoginImplementation() {
		con = DatabaseConnection.connect();
	}

	@Override
	public String fetchOnMobileNumber(LoginModel loginModel) {
		
		try {
			psmt = con.prepareStatement(fetchOnMobileNumber);
			psmt.setLong(1, loginModel.getMobileNumber());
			
			result = psmt.executeQuery();
			
			if(result.next()) {
				passwordFromDatabase=result.getString("password");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return passwordFromDatabase;
	}
}
