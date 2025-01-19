package com.menu.dao;

import java.util.ArrayList;

import com.menu.model.MenuModel;

public interface MenuDao {

	int insertBreakFast(MenuModel menuModel);
	ArrayList<MenuModel> fetchBreakFast();
	int deleteBreakFast(MenuModel menuModel);
	int insertBreakFastAvailability(MenuModel menuModel);
	
	int insertLunch(MenuModel menuModel);
	ArrayList<MenuModel> fetchLunch();
	int deleteLunch(MenuModel menuModel);
	int insertLunchAvailability(MenuModel menuModel);
	
	int insertDinner(MenuModel menuModel);
	ArrayList<MenuModel> fetchDinner();
	int deleteDinner(MenuModel menuModel);
	int insertDinnerAvailability(MenuModel menuModel);
}
