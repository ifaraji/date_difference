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
	
	@Test
	public void whenYearBetween1900And2010ReturnTrue(){
		Assert.assertTrue(tester.test(1999, 1, 1));
	}
	
	@Test
	public void whenYear1900ReturnTrue(){
		Assert.assertTrue(tester.test(1900, 1, 1));
	}
	
	@Test
	public void whenYear2010ReturnTrue(){
		Assert.assertTrue(tester.test(2010, 1, 1));
	}
	
	@Test
	public void whenMonthGreaterThan12ReturnFalse(){
		Assert.assertFalse(tester.test(2000, 13, 1));
	}
	
	@Test
	public void whenMonthLessThan1ReturnFalse(){
		Assert.assertFalse(tester.test(2000, 0, 1));
	}
	
	@Test
	public void whenMonthBetween1And12ReturnTrue(){
		Assert.assertTrue(tester.test(2000, 5, 1));
	}
	
	@Test
	public void whenDayLessThan1ReturnFalse(){
		Assert.assertFalse(tester.test(2000, 5, 0));
	}
}
