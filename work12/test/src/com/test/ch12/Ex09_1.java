package com.test.ch12;

import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try(Scanner scanner = new Scanner(System.in)){
				System.out.println(scanner.nextLine());
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		//scanner는 운영체제의 자원을 빌려서 쓰기 때문에 그냥 scanner로 불러오면 경고가 나타났다.
			//하지만 try, catch 구문으로 구현하면 빌려온뒤 자동으로 자원을 닫기 때문에 경고문이 뜨지 않는다.

	}
}

/*
문제 1.
Scanner 의 nextLine 메소드를 이용하여 입력받은 문자열을 출력하는 코드를 작성하세요.
스캐너는 사용후 scanner.close() 와 같이 자원을 반납하여야 합니다.
반납하지 않으면 경고가 뜨게 됩니다.
try with resources 문법으로 스캐너의 자원을 자동 반납하도록 코딩하세요. 
*/