package com.tablecount.model;

public class TableCountModel {

	private int tableNumber;
	private String status;
	
	public int getTableNumber() {
		return tableNumber;
	}
	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public TableCountModel(int tableNumber, String status) {
		super();
		this.tableNumber = tableNumber;
		this.status = status;
	}
	public TableCountModel() {
		super();
	}
	
	public TableCountModel(int tableNumber) {
		super();
		this.tableNumber = tableNumber;
	}
	@Override
	public String toString() {
		return "tableNumber=" + tableNumber + " status=" + status + " \n";
	}
	
	
	
}
