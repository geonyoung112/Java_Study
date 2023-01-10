package com.test.ch06;

public class Ex02_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] p = {
				{200, 100},
				{100, 200},
				{300, 400}
		};
		
		int total = 0;
		
		for(int i=0; i<p.length; i++) {
			for(int j=0; j<p[i].length; j++) {
				total += p[i][j];
			}
		}
		System.out.println("total = " + total);
	}

}

/*
문제 3.
3명의 회원은 모두 제품 2개씩 구매하였습니다.
3명의 회원이 구매한 제품들의 금액을 배열에 저장한 뒤 모든 금액을 합산하여 출력하세요.
힌트) 2차원 배열과 중첩 for문을 사용하세요.  
*/
