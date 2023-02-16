package com.test.ch14;

public class Ex04StrignBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("자바"); //만약 a와 b를 더해 ab를 만들고 싶다면 그때마다 인스턴스를 새로 생성: 100개면 100개 인스턴스
		sb.append(" ").append("문법 ").append("엘컴퓨처학원 "); //append를 이용해 바로 연결
		sb.append(123);
		String str = sb.toString();
		System.out.println(str);
		
		StringBuilder sb2 = new StringBuilder("자바");//빌더는 쓰레드사용시 사용(더 빨라짐)
		sb2.append(" ").append("문법 ").append("엘컴퓨처학원");
		sb2.append(123);
		String str2 = sb2.toString();
		System.out.println(str2);
		
		long startTime = 0;
		long endTime = 0;
		String str3 = "";
		startTime = System.currentTimeMillis(); //버퍼를 사용안하고 그냥 연결시 시간 더 많이 걸림
		for(int i =0; i<10000; i++) {
			str3 += "a";
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
		
		System.out.println();
		
		startTime = 0;
		endTime = 0;
		StringBuffer sb3 = new StringBuffer(); 
		//0초 보다 더 빠름 : 더 긴구문을 연결한다면 더 오래걸리기 때문에 버퍼를 사용하는 것이 시간도 감소
		startTime = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			sb3.append("a");
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

	}

}

/*
문제 1.
String str = "안 녕 하세 요, 자바 기본 문법 엘 컴퓨터 학원 입니다.";
위 문자열을 char[] 타입으로 변환하세요.
StringBuffer를 이용해 문자열로 만들어 출력하세요. 
*/
