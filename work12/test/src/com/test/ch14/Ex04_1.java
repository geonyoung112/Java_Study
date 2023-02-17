package com.test.ch14;

public class Ex04_1 {

	public static void main(String[] args) {
		String str = "안 녕 하세 요, 자바 기본 문법 엘 컴퓨터 학원 입니다.";
		char[] chArr = str.toCharArray(); // 캐릭터 타입으로 변환
		
		StringBuffer sb = new StringBuffer();//버퍼생성
		for (int i=0; i<chArr.length; i++) {
			sb.append(chArr[i]);
			//sb += chArr[i];를 이용하지 않기 
			//시간이 더 걸린다.
		}
		String result = sb.toString(); //후에 다시 출혁하기 위해 string으로 변환
		System.out.println(result);
		
		
		


	}

}

/*
문제 1.
String str = "안 녕 하세 요, 자바 기본 문법 엘 컴퓨터 학원 입니다.";
위 문자열을 char[] 타입으로 변환하세요.
StringBuffer를 이용해 문자열로 만들어 출력하세요. 
*/