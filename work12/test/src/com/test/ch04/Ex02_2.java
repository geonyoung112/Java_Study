package com.test.ch04;

public class Ex02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] bag = {
				{"티비", "라디오"},
				{"거울", "손수건", "핸드폰"}
		}; 
	
		
		System.out.println("둘리의 장바구니: " + bag[0][0] + ", " + bag[0][1] + "\n");
		System.out.println("또치의 장바구니: " + bag[1][0] + ", " + bag[1][1] + ", "  + bag[1][2] + "\n");

	}

}
/*
문제 2.
둘리와 또치는 장바구니를 가지고 있습니다.
둘리는 2개의 상품을 담을 수 있는 장바구니이고 또치는 3개의 상품을 담을 수 있는 장바구니입니다.
이를 2차원 배열로 표현하세요.
힌트) 담는 상품은 "티비", "라디오" 처럼 임의의 문자열로 표현하면 됩니다. 배열의 타입에 주의하세요.
 */
