package com._if;

import java.util.regex.Pattern;

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
	
	/**
	 * Accespts date as a string in DD MM YYYY format;
	 * @param strDate the given date string
	 */
	public MyDate(String strDate){
		if (!Pattern.matches("^[0-9]{2} [0-9]{2} [0-9]{4}$", strDate))
			throw new RuntimeException(String.format("Invalid date: %s", strDate));
		String[] tokenized = strDate.split(" ");
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
