package com.capgemini.day7;

public class MyDate {

	private String date;

	
	
	public MyDate() {
		super();
		// TODO Auto-generated constructor stub
	}



	public MyDate(String date) {
		super();
		this.setDate(date);
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}
	
	
}
