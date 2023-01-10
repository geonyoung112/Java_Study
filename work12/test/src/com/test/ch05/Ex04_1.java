package com.test.ch05;

import java.util.Scanner;

public class Ex04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int score;
		String season ;
		
		System.out.printf("원하는 월을 입력하세요.%n");
		score = scan.nextInt();
		
		if (score >= 3 && score <= 5) {
			season = "봄";
			System.out.printf("현재 계절은 %s입니다.%n", season);
		} else if (score >= 6 && score <=8) {
			season = "여름";
			System.out.printf("현재 계절은 %s입니다.%n", season);
			if (score == 8) {
				season = "휴가철";
				System.out.printf("입력하신 %d월은 %s입니다.%n", score, season);
			}
			
		} else if (score >= 9 && score <=11) {
			season = "가을";
			System.out.printf("현재 계절은 %s입니다.%n", season);
		} else if (score == 12 || score == 1 || score == 2) {
			season = "겨울";
			System.out.printf("현재 계절은 %s입니다.%n", season);
			
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		

	}

}
/*
문제 1.
사용자가 입력한 숫자에 맞는 계절을 출력하되 8월을 입력하면 "휴가철"도 같이 출력되게 작성하세요.
힌트) 중첩 if문을 사용하세요.  
*/