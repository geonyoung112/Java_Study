package com.test.ch14;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. ==
		String str1 = "가나다라";
		String str2 = new String("가나다라");
		
		if(str1 == str2) {
			System.out.println("두개의 값이 같습니다.");
		}else{
			System.out.println("두개의 값이 같지 않습니다.");
		}
		
		//2. equals
		String s1 = "abcd";
		String s2 = new String("abcd");
		
		if(s1.equals(s2)) {
			System.out.println("두개의 값이 같습니다.");
		}else {
			System.out.println("두개의 값이 같지 않습니다.");
		}
		

	}

}

/*
문제 1.
== 과 equals 의 차이를 설명할 수 있는 예제를 작성하세요.
*/