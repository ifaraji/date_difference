package com._if;

import com._if.dateutils.DateTester;
import com._if.dateutils.DateTesterImpl;

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
		instantiate(yyyy, mm, dd);
	}
	
	public MyDate(String date){
		String[] tokenized = date.split(" ");
		instantiate(Integer.parseInt(tokenized[2]), 
				Integer.parseInt(tokenized[1]), 
				Integer.parseInt(tokenized[0])); 
	}
	
	private void instantiate(int yyyy, int mm, int dd) {
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
