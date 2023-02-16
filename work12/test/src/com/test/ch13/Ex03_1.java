package com.test.ch13;

import java.util.Objects;

public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone p1 = new Phone("삼성", 0123);
		Phone p2 = new Phone("삼성", 0123);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println();
		
		System.out.println(System.identityHashCode(p1));
		System.out.println(p1.hashCode());
		System.out.println(System.identityHashCode(p2));
		System.out.println(p2.hashCode());
		
	}

}

class Phone{
	private String brand;
	private int date;
	
	public Phone(String brand, int date) {
		this.brand = brand;
		this.date = date;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(brand, date);
	}
}
/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
hashCode 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 같은 해시코드를 반환하도록 코딩하세요. 
*/