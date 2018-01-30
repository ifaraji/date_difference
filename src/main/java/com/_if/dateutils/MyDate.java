package com._if.dateutils;

public class MyDate {
	private int yyyy;
	private int mm;
	private int dd;
	
	private DateTester tester;
	
	public int getYyyy() {
		return yyyy;
	}

	public int getMm() {
		return mm;
	}

	public int getDd() {
		return dd;
	}

	public MyDate(int yyyy, int mm, int dd){
		tester = new DateTesterImpl();
		if (tester.test(yyyy, mm, dd)){
			this.yyyy = yyyy;
			this.mm = mm;
			this.dd = dd;
		} else 
			throw new RuntimeException(String.format("Invalid date: %02d %02d %d", dd, mm, yyyy));
	}
	
	public String toString(){
		return String.format("%02d %02d %d", dd, mm, yyyy);
	}
}
