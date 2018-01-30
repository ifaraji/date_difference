package com._if.dateutils;

public class MyDate {
	private int yyyy;
	private int mm;
	private int dd;
	
	private DateTester tester;
	
	public MyDate(int yyyy, int mm, int dd){
		tester = new DateTesterImpl();
		if (tester.test(yyyy, mm, dd)){
			this.yyyy = yyyy;
			this.mm = mm;
			this.dd = dd;
		} else 
			throw new RuntimeException("Invalid date");
	}
	
	public String toString(){
		return String.format("%02d %02d %d", dd, mm, yyyy);
	}
}
