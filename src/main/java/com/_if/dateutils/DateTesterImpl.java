package com._if.dateutils;

public class DateTesterImpl implements DateTester{
	private final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean test(int yyyy, int mm, int dd) {
		if (yyyy < 1900 || yyyy > 2010) //valid year range between 1900 & 2010
			return false; 
		if (mm < 1 || mm > 12) //valid month range between 1 & 12
			return false; 
		if (dd < 1 || dd > DAYS[mm]) //valid day is between 1 & DAYS[month]
			return false; 
		if (mm == 2 && dd == 29 && !isLeapYear(yyyy)) 
			return false;
		return true;
	}
	
	private boolean isLeapYear(int year) {
	    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

}
