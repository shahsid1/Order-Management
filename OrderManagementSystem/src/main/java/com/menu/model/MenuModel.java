package com.menu.model;

public class MenuModel {

	private int id;
	private String name;
	private int price;
	private String description;
	private String availability;
	
	public String getAvailability() {
		return availability;
	}
	public void setAvailability(String availability) {
		this.availability = availability;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public MenuModel(int id, String name, int price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public MenuModel(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	public MenuModel(String name, int price, String description,String availability) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.availability = availability;
	}
	
	public MenuModel(String name, int price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public MenuModel(String name,String availability) {
		super();
		this.name = name;
		this.availability = availability;
	}
	public MenuModel(String name) {
		super();
		this.name = name;
	}
	
	public MenuModel() {
		super();
	}
	@Override
	public String toString() {
		return "name=" + name + " - price=" + price + " - description=" + description
				+ " - availability=" + availability + "\n" ;
	}
	
}
