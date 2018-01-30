package com._if.dateutils;

public class DateDelta {
	private final int BEGINING_OF_TIME = 1900;
	
	public int diffDays(MyDate date1, MyDate date2){
		int diffDays1 = getDiffDaysFromTheBeginingOfTime(date1);
		int diffDays2 = getDiffDaysFromTheBeginingOfTime(date2);
		
		return diffDays1 - diffDays2;
	}
	
	private int getDiffDaysFromTheBeginingOfTime(MyDate date1){
		//calculate the number of full years between date1 and 1900 
		int diffYear = date1.getYyyy() - BEGINING_OF_TIME;
		//calculate the number days of full years between date1 and 1900 regardless of leap years 
		int diffDays = diffYear * 365; 
		//every 4 year is a leap year - add 1 day per leap year to diff days
		int leapYears = (int) Math.floor(diffYear / 4);
		//exclude date1 leap year effect
		if (isLeapYear(date1.getYyyy()))
			leapYears--;
		diffDays += leapYears;
		//add to diffDays the max days of full months for the year of date1
		for (int i = 1; i < date1.getMm(); i++)
			diffDays += getMaxDaysForMonth(i, date1.getYyyy());
		//add to diffDays the days of its current month
		diffDays += date1.getDd();
		
		return diffDays;
	}
	
	private int getMaxDaysForMonth(int month, int year){
		switch(month){ 
		case 1: return 31;
		case 2: return isLeapYear(year) ? 29 : 28;
		case 3: return 31;
		case 4: return 30;
		case 5: return 31;
		case 6: return 30;
		case 7: return 31;
		case 8: return 31;
		case 9: return 30;
		case 10: return 31;
		case 11: return 30;
		case 12: return 31;
		default: return 0;
		}
	}
	
	private boolean isLeapYear(int year) {
	    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
}
