package com.test.ch07;

import java.util.Arrays;
import java.util.Scanner;


public class Ex04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		BookTest book = new BookTest();
		System.out.println("-----------------");
		//book.price = 8000;
		book.setPrice(-3000);
		System.out.printf("가격:%d%n",book.getPrice());
		book.setPrice(50000);
		System.out.println(book.getPrice());


		BookTest book2 = new BookTest();
		System.out.println("-----------------");
		book2.setPrice(20000);
		System.out.printf("가격:%d%n",book.getPrice());;
		

	}

}

class BookTest {
	int price;
	String author;
	

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		if(!(price < 80000 && 10000 <= price)) {
			System.out.println("설정 가능하지 않는 가격입니다.");
			return;
		}
			
		this.price = price;
	}
	

	void setauthor(String author) {
		Scanner s = new Scanner(System.in);
		String[] arr = new String[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+1 + "번째 저자를 입력하세요: ");
			String name = s.nextLine();
			arr[i] = name;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
/*
문제 1.
BookTest 클래스를 작성하세요.
가격을 저장하는 인스턴스 변수를 선언하세요.
책의 가격을 설정하는 메소드를 작성하세요.
책의 가격은 10000원 이상 80000원 미만으로만 설정가능해야 하며 그 외의 금액은 "설정 가능하지 않은 가격입니다." 를 출력하세요.
문제 2.
BookTest 클래스의 인스턴스를 두 개 생성하여 메소드를 사용하여 각각 금액을 설정하고 설정된 금액을 출력하세요.
문제 3.
BookTest 클래스에 책의 저자를 최대 3명까지 저장할 수 있는 배열을 선언하세요.
저자를 설정할 수 있는 메소드를 작성하세요.
힌트1) 메소드 파라미터로 배열 사용이 가능합니다.
힌트2) for문과 배열간의 대입을 활용하세요. 
*/