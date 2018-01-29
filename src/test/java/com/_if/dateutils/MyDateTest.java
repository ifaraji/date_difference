package com._if.dateutils;

import org.junit.Test;

import org.junit.Assert;

public class MyDateTest {
	
	@Test
	public void testToString(){
		MyDate date = new MyDate(2000, 12, 31);
		Assert.assertEquals("31 12 2000", date.toString());
	}
	
	@Test
	public void testToStringWithOneDigitDayAndMonth(){
		MyDate date = new MyDate(2000, 9, 7);
		Assert.assertEquals("07 09 2000", date.toString());
	}
	
	@Test(expected = RuntimeException.class)
	public void whenYearLessThan1900ExveptionIsThrown(){
		MyDate date = new MyDate(1899, 1, 1);
		date.toString(); //to avoid unused object warning
	}
	
	@Test(expected = RuntimeException.class)
	public void whenYearGreaterThan2010ExveptionIsThrown(){
		MyDate date = new MyDate(2011, 1, 1);
		date.toString(); //to avoid unused object warning
	}
}
