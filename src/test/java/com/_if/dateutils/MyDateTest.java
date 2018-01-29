package com._if.dateutils;

import org.junit.Test;

import org.junit.Assert;

public class MyDateTest {
	public void testToString(){
		MyDate date = new MyDate(2000, 12, 31);
		Assert.assertEquals("31 12 2000", date.toString());
	}
}
