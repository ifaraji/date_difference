package com._if.dateutils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com._if.MyDate;

public class DateDeltaTest {
	private DateDelta delta;
	
	@Before
	public void init(){
		delta = new DateDelta();
	}
	
	@Test
	public void testDiffDays(){
		MyDate date1 = new MyDate(2000, 12, 31);
		MyDate date2 = new MyDate(2001, 01, 01);
		int diff = delta.diffDays(date2, date1);
		Assert.assertEquals(1, diff);
	}
	
	@Test
	public void testDiffDaysWith2leapYears(){
		MyDate date1 = new MyDate(2000, 12, 31);
		MyDate date2 = new MyDate(2004, 12, 31);
		int diff = delta.diffDays(date2, date1);
		Assert.assertEquals(1461, diff);
	}
	
	@Test
	public void testDiffDaysWithOnlyDifferentDays(){
		MyDate date1 = new MyDate(2005, 2, 4);
		MyDate date2 = new MyDate(2005, 2, 7);
		int diff = delta.diffDays(date2, date1);
		Assert.assertEquals(3, diff);
	}
	
	@Test
	public void testDiffDaysWith1DayDiffAcross2Months(){
		MyDate date1 = new MyDate(2005, 2, 28);
		MyDate date2 = new MyDate(2005, 3, 1);
		int diff = delta.diffDays(date2, date1);
		Assert.assertEquals(1, diff);
	}
	
	@Test
	public void testDiffDaysWithOneYearDifference(){
		MyDate date1 = new MyDate(2005, 4, 1);
		MyDate date2 = new MyDate(2006, 4, 1);
		int diff = delta.diffDays(date2, date1);
		Assert.assertEquals(365, diff);
	}
	
	@Test
	public void testDiffDaysWithOneYearAndOneDayDifference(){
		MyDate date1 = new MyDate(2005, 4, 1);
		MyDate date2 = new MyDate(2006, 4, 2);
		int diff = delta.diffDays(date2, date1);
		Assert.assertEquals(366, diff);
	}
}
