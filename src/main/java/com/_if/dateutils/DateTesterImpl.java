package com._if.dateutils;

public class DateTesterImpl implements DateTester{

	public boolean test(int yyyy, int mm, int dd) {
		if (yyyy < 1900 || yyyy > 2010) return false;
		if (mm < 1 || mm > 12) return false;
		if (dd < 1) return false;
		return true;
	}

}
