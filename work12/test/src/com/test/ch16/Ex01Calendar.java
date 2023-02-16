package com.test.ch16;

import java.util.Calendar;

public class Ex01Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH) +1;
		System.out.println(month);
		
		int day = now.get(Calendar.DATE);
		System.out.println(day);
		
		int hour12 = now.get(Calendar.HOUR);
		System.out.println(hour12);
		
		int hour24 = now.get(Calendar.HOUR_OF_DAY);
		System.out.println(hour24);
		
		int minute = now.get(Calendar.MINUTE);
		System.out.println(minute);
		
		int second = now.get(Calendar.SECOND);
		System.out.println(second);
		
		int millisecond = now.get(Calendar.MILLISECOND);
		System.out.println(millisecond);
		
	

	}

}
