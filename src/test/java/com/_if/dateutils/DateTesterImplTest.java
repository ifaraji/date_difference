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
	
	@Test
	public void whenMonthDiffersSoDoesMaxDays(){
		//JAN
		Assert.assertTrue(tester.test(2000, 1, 31));
		Assert.assertFalse(tester.test(2000, 1, 32));
		//FEB, leap year
		Assert.assertTrue(tester.test(2000, 2, 29));
		Assert.assertFalse(tester.test(2000, 2, 30));
		//FEB, non-leap year
		Assert.assertTrue(tester.test(2001, 2, 28));
		Assert.assertFalse(tester.test(2001, 2, 29));
		//MAR
		Assert.assertTrue(tester.test(2000, 3, 31));
		Assert.assertFalse(tester.test(2000, 3, 32));
		//APR
		Assert.assertTrue(tester.test(2000, 4, 30));
		Assert.assertFalse(tester.test(2000, 4, 31));
		//MAY
		Assert.assertTrue(tester.test(2000, 5, 31));
		Assert.assertFalse(tester.test(2000, 5, 32));
		//JUN
		Assert.assertTrue(tester.test(2000, 6, 30));
		Assert.assertFalse(tester.test(2000, 6, 31));
		//JUL
		Assert.assertTrue(tester.test(2000, 7, 31));
		Assert.assertFalse(tester.test(2000, 7, 32));
		//AUG
		Assert.assertTrue(tester.test(2000, 8, 31));
		Assert.assertFalse(tester.test(2000, 8, 32));
		//SEP
		Assert.assertTrue(tester.test(2000, 9, 30));
		Assert.assertFalse(tester.test(2000, 9, 31));
		//OCT
		Assert.assertTrue(tester.test(2000, 10, 31));
		Assert.assertFalse(tester.test(2000, 10, 32));
		//NOV
		Assert.assertTrue(tester.test(2000, 11, 30));
		Assert.assertFalse(tester.test(2000, 11, 31));
		//DEC
		Assert.assertTrue(tester.test(2000, 12, 31));
		Assert.assertFalse(tester.test(2000, 12, 32));
	}
}
