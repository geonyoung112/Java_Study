package com.test.ch14;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "안녕하세요, 엘컴#퓨터@@학원 입니다.!~%";
		String filter = ",@!~%#";
		String result = "";
		
		String target = " ";
		int pos = 0;
		int count = 0;
		
		//1. 특정 문자열 제거
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			
			if(filter.indexOf(ch) == -1) {
				result += String.valueOf(ch);
			}
		}
		
		System.out.println(result);
		
		//2. 공백의 수 
		//1의 결과값을 이용하고 타겟으로 공백을 설정 후 연산자 우선수위로 인해 () 작성하기
		while((pos = result.indexOf(target, pos)) != -1) { 
			pos += target.length();
			count++;
			
		}
		
		System.out.println("공백의 수: " + count);

	}

}

/*
문제 1.
"안녕하세요, 엘컴#퓨터@@학원 입니다.!~%"
위 문자열에서 ,@!~%# 문자를 제거한 뒤 출력하는 프로그램을 코딩하세요.
문제 2.
위 문자열에서 공백의 수를 카운팅하여 출력하세요.
*/