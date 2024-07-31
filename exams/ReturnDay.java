package com.basicprograms.exams;

import java.util.Calendar;
import java.util.Scanner;

public class ReturnDay {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year,month and day separated by space");
		String s = sc.nextLine();
		String ins[] = s.split(" ");

		int year = Integer.parseInt(ins[0]);
		int month = Integer.parseInt(ins[1]);
		int day = Integer.parseInt(ins[2]);
		
		CalDay c = new CalDay();
		System.out.println(c.findDay(year,month,day));
		sc.close();
	}

}
class CalDay{
	
	public String findDay(int year, int month, int day) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month-1, day);
		int weekday = calendar.get(Calendar.DAY_OF_WEEK);
		String week_days[] = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
		return week_days[weekday-1];
	}
}