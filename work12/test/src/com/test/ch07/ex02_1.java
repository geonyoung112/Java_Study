package com.test.ch07;

import java.util.Scanner;

public class ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("도서관리프로그램");
		
		Book14 book141 = null;
		
		Book14[] arrBook = new Book14[10];
		boolean run = true;
		int index = 0;

		
		while(true) {	
			
			System.out.println("-----------------");
			System.out.println("메뉴를 선택하세요. 1: 책등록, 2: 책목록 조회, 0: 종료");
			System.out.println(">>");
			int userInput = scanner.nextInt();
			scanner.nextLine();
			
			
			switch(userInput) {
				case 1: 
					book141 = new Book14();
					System.out.println("책을 등록하세요.");
					System.out.print("제목:");
					book141.title = scanner.nextLine();
					System.out.print("저자:");
					book141.author = scanner.nextLine();
					System.out.print("가격:");
					book141.price = scanner.nextInt();
					System.out.printf("제목: %s, 저자: %s, 가격: %d%n%n", book141.title, book141.author, book141.price);
					arrBook[index++] = book141;
					break;
				
				case 2: 
					System.out.println("책의 목록을 확인합니다.");
					
					for(int i=0; i<arrBook.length; i++) {
						if (arrBook[i] == null)
							break;
						System.out.printf("제목: %s, 저자: %s, 가격: %d%n", arrBook[i].title, arrBook[i].author, arrBook[i].price);
					}
					break;
					
				case 0:
					run = false;
					break;
		
			}
			
			if(!run)
				break;
		}
		System.out.println("프로그램이 종료됩니다.");
		
		
	}

}

class Book14 {
	String title;
	String author;
	int price;
}

/*
문제 1.
클래스를 이용하여 도서관리 프로그램 등록과 목록 기능을 개발하세요. 
*/