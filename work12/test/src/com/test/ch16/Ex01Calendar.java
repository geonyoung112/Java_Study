package com.test.ch16;

import java.util.Calendar;

public class Ex01Calendar {
	//캘랜더 클래스는 계산할때, 데이트 클래스는 값을 출력할때 사용한다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH) +1; 	// 0 ~ 11 "0부터 시작하는 것 기억하기"
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
		
		int ampm = now.get(Calendar.AM_PM);
		String strAmpm = ampm == 0 ? "AM" : "PM";
		System.out.println(ampm + ", " + strAmpm);	 // 0: am, 1: pm
		
		String[] strDayOfWeek = {"", "일", "월", "화", "수", "목", "금", "토"};
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);	 // 1:일, 2:월, 3:화, 4:수, 5:목, 6:금, 7:토 _ 숫자로 반환하는 것
		System.out.println(dayOfWeek + ", " + strDayOfWeek[dayOfWeek]);
		
		String strDateTime = year + "-" + month + "-" + day + " " + hour12 + ":" + minute + ":" + second + "." + millisecond 
				+ " " + strAmpm + " " + strDayOfWeek[dayOfWeek] + "오일";
		
		System.out.println(strDateTime);
		System.out.println();
		
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.set(2030, 9, 7, 0, 0, 0);
		System.out.println(start.getTime());
		System.out.println(end.getTime());
		
		long diffMilli = end.getTimeInMillis() - start.getTimeInMillis();		// 밀리세컨즈
		//컴퓨터는 대략 1970년부터 시간을 기록해서 그 시간을 기준으로 end타임과 start타임을 각각 차이를 밀리세컨드로 구하고 이어서 end와 start의 밀리세커드를 뺀다.
		System.out.println(diffMilli + " 밀리초");
		long diffSecond = diffMilli/(1000);		// 초
		System.out.println(diffSecond + " 초");
		long diffMinute = diffMilli / (60 * 1000);	// 분
		System.out.println(diffMinute + " 분");
		long diffHour = diffMilli / (60 * 60 * 1000);	// 시간
		System.out.println(diffHour + " 시간");
		long diffDay = diffMilli / (24 * 60 * 60 * 1000);	// 일
		System.out.println(diffDay + " 일");
		long diffYear = diffMilli / (365L * 24 * 60 * 60 * 1000);	// 년  //365일을 롱타입으로 적기
		System.out.println(diffYear + " 년");
		System.out.println();
		System.out.println(diffDay / 365 + "년 ");
		System.out.println(diffDay % 365 + " 일 차이");
		System.out.println();
		
		
		Calendar today = Calendar.getInstance();
		System.out.println(today.getTime().toString()); 
		
		today.add(Calendar.DATE, 1);
		System.out.println(today.getTime().toString());
		
		today.add(Calendar.DATE, -1);
		System.out.println(today.getTime().toString());
		
		today.set(Calendar.DATE, 22);
		System.out.println(today.getTime().toString());
				
	}

}

/*
문제 1.
2000년 12월 1일 
2020년 5월 6일 
두 날짜 간의 차이를 계산하여 n년 n일과 같은 패턴으로 출력하세요. 
*/
