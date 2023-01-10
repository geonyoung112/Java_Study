package com.test.ch06;


public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int sum = 0;
		
		while(i++<=100) {
			if(i%2!=0)
				continue;
			
			sum += i;
			System.out.println(sum);
			
			if (sum >50) {
				System.out.println(i);
				break;
			}
		}
		

	}
}


/*
문제 1.
i=1, sum=0 일때
i는 1씩 증가되고 i가 짝수일 경우 sum에 누적됩니다.
sum의 값이 50을 초과할 때의 i값을 출력하세요.
while문, continue, break문을 사용해야 합니다.  
*/