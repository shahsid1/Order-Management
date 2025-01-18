package com.tablecount.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.connection.DatabaseConnection;
import com.tablecount.dao.TableCountDao;
import com.tablecount.model.TableCountModel;

public class TableCountImplementation implements TableCountDao{

	
	
	
	private Connection con;
	private String insertQuerry="insert into tablecount (tableNumber ,status) values(?,?)";
	private String fetchStatusQuerry="select * from tablecount";
	private String truncateQuerry="truncate table tablecount";
	private PreparedStatement psmt;
	private int status;
	private Statement csmt;
	private ResultSet result;
	ArrayList<TableCountModel> tableList = new ArrayList<TableCountModel>();
	private Object callstmt;

	public TableCountImplementation() {
		con = DatabaseConnection.connect();
	}
	
	@Override
	public int insert(TableCountModel tableCountModel) {
	
		try {
			psmt = con.prepareStatement(insertQuerry);
			psmt.setInt(1, tableCountModel.getTableNumber());
			psmt.setString(2, tableCountModel.getStatus() );
			
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public ArrayList<TableCountModel> fetchStatus() {
		
		try {
			csmt = con.createStatement();
			result = csmt.executeQuery(fetchStatusQuerry);
			
			while(result.next()) {
				 
				tableList.add(new TableCountModel(result.getInt("tableNumber") , result.getString("status"))) ;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return tableList;
	}

	@Override
	public int truncate() {
		
		try {
			
			csmt = con.createStatement();
			status = csmt.executeUpdate(truncateQuerry);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}
	
	

}
