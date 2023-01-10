package com.test.ch05;

import java.util.Scanner;

public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int score;
		
		System.out.printf("원하는 월을 입력하세요.%n");
		score = scan.nextInt();
		
		if (score >= 3 && score <= 5) {
			System.out.println("현재는 봄입니다.");
		} else if (score >= 6 && score <=8) {
			System.out.println("현재는 여름입니다.");
		} else if (score >= 9 && score <=11) {
			System.out.println("현재는 가을입니다.");
		} else if (score == 12 || score == 1 || score == 2) {
			System.out.println("현재는 겨울입니다.");
		} else {
			System.out.println("잘 못 입력하셨습니다.");
		}
		
	}
}
/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 작성하세요.  
*/