package com._if.dateutils;

public class MyDate {
	private int yyyy;
	private int mm;
	private int dd;
	
	public MyDate(int yyyy, int mm, int dd){
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
		
		//only accepting dates between 1900 and 2010
		if (yyyy < 1900 || yyyy > 2010)
			throw new RuntimeException("Invalid date");
	}
	
	public String toString(){
		return String.format("%02d %02d %d", dd, mm, yyyy);
	}
}
