package com.test.ch12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex09_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			try(Scanner scanner = new Scanner(new File("input.txt"))){
				System.out.println(scanner.nextLine());
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}
		

	}
}

/*
문제 1.
Scanner 의 nextLine 메소드를 이용하여 입력받은 문자열을 출력하는 코드를 작성하세요.
스캐너는 사용후 scanner.close() 와 같이 자원을 반납하여야 합니다.
반납하지 않으면 경고가 뜨게 됩니다.
try with resources 문법으로 스캐너의 자원을 자동 반납하도록 코딩하세요. 
*/