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
}
