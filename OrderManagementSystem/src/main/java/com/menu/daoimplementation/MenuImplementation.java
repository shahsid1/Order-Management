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
	private String insertBreakfastquerry="insert into breakfast (name,price,description) values (?,?,?)";
	private String fetchBreakfastquerry="select name,price,description from breakfast";
	private String deleteBreakfastquerry="delete from breakfast where name=?";
	
	private String insertLunchquerry="insert into lunch (name,price,description) values (?,?,?)";
	private String fetchLunchquerry="select name,price,description from lunch";
	private String deleteLunchquerry="delete from lunch where name=?";
	
	private String insertDinnerquerry="insert into dinner (name,price,description) values (?,?,?)";
	private String fetchDinnerquerry="select name,price,description from dinner";
	private String deleteDinnerquerry="delete from dinner where name=?";
	
	private PreparedStatement psmt;
	private int status;
	private Statement csmt;
	private ResultSet result;
	ArrayList<MenuModel> breakfastList = new ArrayList<MenuModel>();
	ArrayList<MenuModel> lunchList = new ArrayList<MenuModel>();
	ArrayList<MenuModel> dinnerList = new ArrayList<MenuModel>();
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
				breakfastList.add(new MenuModel( result.getString("name"), result.getInt("price"), result.getString("description"))) ;
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
				lunchList.add(new MenuModel( result.getString("name"), result.getInt("price"), result.getString("description"))) ;
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
				dinnerList.add(new MenuModel( result.getString("name"), result.getInt("price"), result.getString("description"))) ;
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
	
	
	
}
