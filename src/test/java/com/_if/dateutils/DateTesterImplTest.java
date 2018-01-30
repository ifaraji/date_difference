package com._if.dateutils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DateTesterImplTest {
	
	private DateTester tester;
	
	@Before
	public void init(){
		tester = new DateTesterImpl();
	}
	
	@Test
	public void whenYearLessThan1900ReturnFalse(){
		Assert.assertFalse(tester.test(1899, 1, 1));
	}
	
	@Test
	public void whenYearGreaterThan2010ReturnFalse(){
		Assert.assertFalse(tester.test(2011, 1, 1));
	}
}
