package com.test.ch16;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		Scanner scan = new Scanner(System.in);
		Date inputDate = null;
		
		
		System.out.println("yyyy년MM월dd일 패턴으로 날짜를 입력해주세요: ");
		String strDate = scan.nextLine();
		
		try {
			inputDate = sdf.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(inputDate);
		cal.add(Calendar.MONTH, 1);
		Date inputDate2 = cal.getTime();
		
		System.out.println(sdf2.format(inputDate2));

	}

}

/*
문제1.
yyyy년MM월dd 패턴으로 입력 받아 
1개월 뒤의 날짜를 yyyy/MM/dd 패턴으로 출력하세요.
*/