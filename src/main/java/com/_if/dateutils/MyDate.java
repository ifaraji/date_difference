package com._if.dateutils;

public class MyDate {
	private int yyyy;
	private int mm;
	private int dd;
	
	public MyDate(int yyyy, int mm, int dd){
		this.yyyy = yyyy;
		this.mm = mm;
		this.dd = dd;
	}
	
	public String toString(){
		return String.format("%d %d %d", dd, mm, yyyy);
	}
}
