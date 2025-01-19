package com.menu.daoimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.connection.DatabaseConnection;
import com.menu.dao.MenuDao;
import com.menu.model.MenuModel;

public class MenuImplementation implements MenuDao{

	private Connection con;
	private String insertBreakfastquerry="insert into breakfast (name,price,description,availability) values (?,?,?,'Available')";
	private String fetchBreakfastquerry="select name,price,description,availability from breakfast";
	private String deleteBreakfastquerry="delete from breakfast where name=?";
	private String insertBreakFastAvailabilityquerry="update breakfast set availability=? where name=?";
	
	private String insertLunchquerry="insert into lunch (name,price,description,availability) values (?,?,?,'Available')";
	private String fetchLunchquerry="select name,price,description,availability from lunch";
	private String deleteLunchquerry="delete from lunch where name=?";
	private String insertLunchAvailabilityquerry="update lunch set availability=? where name=?";
	
	private String insertDinnerquerry="insert into dinner (name,price,description,availability) values (?,?,?,'Available')";
	private String fetchDinnerquerry="select name,price,description,availability from dinner";
	private String deleteDinnerquerry="delete from dinner where name=?";
	private String insertDinnerAvailabilityquerry="update dinner set availability=? where name=?";
	
	private PreparedStatement psmt;
	private int status;
	private Statement csmt;
	private ResultSet result;
	ArrayList<MenuModel> breakfastList = new ArrayList<MenuModel>();
	ArrayList<MenuModel> lunchList = new ArrayList<MenuModel>();
	ArrayList<MenuModel> dinnerList = new ArrayList<MenuModel>();
	
	ArrayList<MenuModel> breakfastNameList = new ArrayList<MenuModel>();
	ArrayList<MenuModel> lunchNameList = new ArrayList<MenuModel>();
	ArrayList<MenuModel> dinnerNameList = new ArrayList<MenuModel>();
	public MenuImplementation() {
		con = DatabaseConnection.connect();
	}

	
	@Override
	public int insertBreakFast(MenuModel menuModel) {	
		try {
			psmt = con.prepareStatement(insertBreakfastquerry);
			psmt.setString(1, menuModel.getName());
			psmt.setInt(2, menuModel.getPrice());
			psmt.setString(3, menuModel.getDescription());
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public ArrayList<MenuModel> fetchBreakFast() {
		try {
			csmt =  con.createStatement();
			result = csmt.executeQuery(fetchBreakfastquerry);	
			while(result.next()) {
				breakfastList.add(new MenuModel( result.getString("name"), result.getInt("price"), result.getString("description"),result.getString("availability"))) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return breakfastList;
	}

	@Override
	public int deleteBreakFast(MenuModel menuModel) {		
		try {
			psmt = con.prepareStatement(deleteBreakfastquerry);
			psmt.setString(1,menuModel.getName() );
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int insertLunch(MenuModel menuModel) {
		try {
			psmt = con.prepareStatement(insertLunchquerry);
			psmt.setString(1, menuModel.getName());
			psmt.setInt(2, menuModel.getPrice());
			psmt.setString(3, menuModel.getDescription());
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public ArrayList<MenuModel> fetchLunch() {
		try {
			csmt =  con.createStatement();
			result = csmt.executeQuery(fetchLunchquerry);	
			while(result.next()) {
				lunchList.add(new MenuModel( result.getString("name"), result.getInt("price"), result.getString("description"),result.getString("availability"))) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lunchList;
	}

	@Override
	public int deleteLunch(MenuModel menuModel) {
		try {
			psmt = con.prepareStatement(deleteLunchquerry);
			psmt.setString(1,menuModel.getName() );
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public int insertDinner(MenuModel menuModel) {
		try {
			psmt = con.prepareStatement(insertDinnerquerry);
			psmt.setString(1, menuModel.getName());
			psmt.setInt(2, menuModel.getPrice());
			psmt.setString(3, menuModel.getDescription());
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public ArrayList<MenuModel> fetchDinner() {
		try {
			csmt =  con.createStatement();
			result = csmt.executeQuery(fetchDinnerquerry);	
			while(result.next()) {
				dinnerList.add(new MenuModel( result.getString("name"), result.getInt("price"), result.getString("description"),result.getString("availability"))) ;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dinnerList;
	}

	@Override
	public int deleteDinner(MenuModel menuModel) {
		try {
			psmt = con.prepareStatement(deleteDinnerquerry);
			psmt.setString(1,menuModel.getName() );
			status = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}


	@Override
	public int insertBreakFastAvailability(MenuModel menuModel) {
		
		try {
			psmt = con.prepareStatement(insertBreakFastAvailabilityquerry);
			psmt.setString(1, menuModel.getAvailability());
			psmt.setString(2, menuModel.getName());
			status = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}


	@Override
	public int insertLunchAvailability(MenuModel menuModel) {
		try {
			psmt = con.prepareStatement(insertLunchAvailabilityquerry);
			psmt.setString(1, menuModel.getAvailability());
			psmt.setString(2, menuModel.getName());
			status = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	}


	@Override
	public int insertDinnerAvailability(MenuModel menuModel) {
		
		try {
			psmt = con.prepareStatement(insertDinnerAvailabilityquerry);
			psmt.setString(1, menuModel.getAvailability());
			psmt.setString(2, menuModel.getName());
			status = psmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}


	
	
	
}
