package com._if.dateutils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
}
