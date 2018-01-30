package com._if.client;

import java.util.Scanner;
import java.util.regex.Pattern;

import com._if.MyDate;
import com._if.dateutils.DateDelta;

public class App {

	public static void main(String[] args) {
		DateDelta delta = new DateDelta();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter dates (DD MM YYYY, DD MM YYYY) or type exit to end: ");
			String cmd = sc.nextLine();
			if (cmd.equalsIgnoreCase("exit"))
				break;
			else {
				if (!Pattern.matches("^[0-9 ]*, [0-9 ]*$", cmd))
					System.out.println("Invalid input.");
				else {
					try{
						String[] dates = cmd.split(",");
						MyDate date1 = new MyDate(dates[0].trim());
						MyDate date2 = new MyDate(dates[1].trim());
						int diff = delta.diffDays(date1, date2);
						print(date1, date2, diff);
					}catch(RuntimeException e){
						System.out.println(e.getMessage());
					}
					
				}
			}
		}
		sc.close();

	}

	private static void print(MyDate date1, MyDate date2, int diff) {
		if (date1.compareTo(date2) <= 0)
			System.out.println(String.format("%s, %s, %d", date1, date2, Math.abs(diff)));
		else
			System.out.println(String.format("%s, %s, %d", date2, date1, Math.abs(diff)));
		
	}

}
