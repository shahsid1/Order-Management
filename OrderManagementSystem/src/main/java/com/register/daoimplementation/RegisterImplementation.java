package com.register.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.connection.DatabaseConnection;
import com.register.dao.RegisterDao;
import com.register.model.RegisterModel;

public class RegisterImplementation implements RegisterDao{
	
	

	private Connection con;
	private String insertQuerry="insert into resturantregister(name , email , password ,mobileNumber ,resturantName) values(?,?,?,?,?)";
	private PreparedStatement psmt;
	private int status;
	
	public RegisterImplementation() {
		
		con=DatabaseConnection.connect();
	}

	@Override
	public int insert(RegisterModel registerModel) {
		
		try {
			psmt = con.prepareStatement(insertQuerry);
			psmt.setString(1, registerModel.getName());
			psmt.setString(2, registerModel.getEmail());
			psmt.setString(3, registerModel.getPassword());
			psmt.setLong(4, registerModel.getMobileNumber());
			psmt.setString(5, registerModel.getResturantName());
			
			status = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}

}
