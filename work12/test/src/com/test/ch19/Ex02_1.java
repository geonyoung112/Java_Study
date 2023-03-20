package com.test.ch19;


public class Ex02_1 {
	public static void main(String[] args) {
		
	}
}



class User2 {
	private String number;
	private int time;
	public User2(String number, int time) {
		this.number = number;
		this.time = time;
	}
	public String getNumber() {
		return number;
	}
	public int getTime() {
		return time;
	}
	@Override
	public String toString() {
		return "number=" + number + ", time=" + time;
	}	
}
/*
문제 2.
차량 출입 시간이 5시에서 9시 사이인 차량만 출력하는 프로그램을 코딩하세요.
위 회원 검색 프로그램과 같이 함수형 인터페이스를 작성하고 람다식을 사용해야 합니다.  
*/