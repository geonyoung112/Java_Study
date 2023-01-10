package com.test.ch05;

import java.util.Scanner;

public class Ex05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int month;
		
		System.out.printf("월을 입력하세요.%n");
		month = scan.nextInt();
		
		switch (month) {
		case 3: case 4: case 5:
			System.out.println("현재는 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재는 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재는 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("현재는 겨울입니다.");
			break;
		}
		
		

	}

}
/*
문제 1.
입력 받은 숫자가 3~5이면 "봄", 6~8이면 "여름", 9~11이면 "가을" 12,1,2 를 입력하면 "겨울"을 출력하고 
그 외의 숫자를 입력하면 "잘 못 입력하였습니다"를 출력하는 코드를 switch문으로 작성하세요. 
*/