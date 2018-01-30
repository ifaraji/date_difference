package com._if.dateutils;

import com._if.MyDate;

public class DateDelta {
	private final int BEGINING_OF_TIME = 1900;
	private final int[] DAYS = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	/**
	 * Calculates the number of days from and including the start date
	 * to, but not including the end date
	 * @param date1 The given start date
	 * @param date2 The given end date 
	 * @return int number of days
	 */
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
		int maxDays = DAYS[month];
		if (month == 2 && isLeapYear(year))
			maxDays++;
		return maxDays;
	}
	
	private boolean isLeapYear(int year) {
	    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
}
