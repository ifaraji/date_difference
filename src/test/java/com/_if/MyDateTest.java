package com._if;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import com._if.MyDate;

import org.junit.Assert;
import org.junit.Rule;

public class MyDateTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
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
	public void whenInvalidDateExceptionIsThrown(){
		MyDate date = new MyDate(1899, 1, 1); //only years between 1900 and 2010 are accepted
		date.toString(); //to avoid unused object warning
	}
	
	@Test(expected = RuntimeException.class)
	public void whenInvalidDateExceptionIsThrown2(){
		MyDate date = new MyDate(1900, 2, 29); //1900 was NOT a leap year
		date.toString(); //to avoid unused object warning
	}
	
	@Test(expected = RuntimeException.class)
	public void whenInvalidDateExceptionIsThrown3(){
		MyDate date = new MyDate(2007, 4, 31); //max days is 30 for April
		date.toString(); //to avoid unused object warning
	}
	
	@Test(expected = RuntimeException.class)
	public void whenInvalidDateExceptionIsThrown4(){
		MyDate date = new MyDate(2011, 1, 1); //only years between 1900 and 2010 are accepted
		date.toString(); //to avoid unused object warning
	}

	@Test
	public void whenValidDateThenNoExceptionIsThrown(){
		MyDate date = new MyDate(1904, 2, 29); //1904 was a leap year
		Assert.assertEquals("29 02 1904", date.toString());
	}
	
	@Test
	public void testConstructorWithStringParameter(){
		MyDate date = new MyDate("29 02 1904");
		Assert.assertEquals("29 02 1904", date.toString());
	}
	
	@Test
	public void testConstructorWithInvalidStringParameter(){
		String input = "hbhssdcvus";
		exception.expect(RuntimeException.class);
	    exception.expectMessage(String.format("Invalid date: %s", input));
		MyDate date = new MyDate(input);
		date.toString(); //to avoid unused object warning
	}

}
