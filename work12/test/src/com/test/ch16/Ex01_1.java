package com.test.ch16;

import java.util.Calendar;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar start = Calendar.getInstance();
		start.set(2000, 12, 1, 0, 0, 0);
		Calendar end = Calendar.getInstance();
		end.set(2020, 9, 7, 0, 0, 0);
		
		System.out.println(start.getTime());
		System.out.println(end.getTime());
		System.out.println();
		
		
		long diffMilli1 = end.getTimeInMillis() - start.getTimeInMillis();
		long diffDay1 = diffMilli1 / (24 * 60 * 60 * 1000);	
		
		System.out.println("두 날짜 간의 차이: " + diffDay1 / 365 + "년 "  + diffDay1 % 365 + " 일 차이");
		
	}

}
/*
문제 1.
2000년 12월 1일 
2020년 5월 6일 
두 날짜 간의 차이를 계산하여 n년 n일과 같은 패턴으로 출력하세요. 
*/