package com._if.dateutils;

public class DateTesterImpl implements DateTester{

	public boolean test(int yyyy, int mm, int dd) {
		if (yyyy < 1900 || yyyy > 2010) //valid year range between 1900 & 2010
			return false; 
		if (mm < 1 || mm > 12) //valid month range between 1 & 12
			return false; 
		if (dd < 1) //valid day is greater than zero
			return false; 
		//valid max day for each month
		switch(mm){ 
		case 1: return (dd <= 31);
		case 2: return ((dd <= 28 && !isLeapYear(yyyy)) || (dd == 29 && isLeapYear(yyyy)));
		case 3: return (dd <= 31);
		case 4: return (dd <= 30);
		case 5: return (dd <= 31);
		case 6: return (dd <= 30);
		case 7: return (dd <= 31);
		case 8: return (dd <= 31);
		case 9: return (dd <= 30);
		case 10: return (dd <= 31);
		case 11: return (dd <= 30);
		case 12: return (dd <= 31);
		default: return false;
		}
	}
	
	private boolean isLeapYear(int year) {
	    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}

}
