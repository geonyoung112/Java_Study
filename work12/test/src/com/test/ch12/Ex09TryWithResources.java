package com.test.ch12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//운영체제에서 자원을 받아올때 사용하는 
public class Ex09TryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try1();
		
		System.out.println("\n\n----------\n");
		
		try2();
	}
	
	//새로운 요즘 방식, 메소드는 변수 첫글자 소문자
	public static void try1() {
		try(
				FileReader fr = new FileReader("./scr/com/test/ch12/Ex01TryCatch.java");
				BufferedReader br = new BufferedReader(fr);
		){
			int data;
			while((data = br.read())!= -1) {
				char ch = (char)data;
				System.out.println(ch);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}//요즘은 자원을 받아오고 사용하고 나면 자동으로 닫는 방법이 생겨 사용중
	
	//예전 방식
	public static void try2() {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("./src/com/test/ch12/Ex01TryCatch.java");
			br = new BufferedReader(fr);
			
			int data;
			while((data = br.read()) != -1) {
				char ch = (char)data;
				System.out.println(ch);
			}
		}catch(IOException e) {
			e.printStackTrace();
			
		}finally {
			try {
				br.close();
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	//예전에는 계속 자원을 쓰기도 전에 닫아버려서 파이널을 이용해서 닫아줘야했다.

}

/*
문제 1.
Scanner 의 nextLine 메소드를 이용하여 입력받은 문자열을 출력하는 코드를 작성하세요.
스캐너는 사용후 scanner.close() 와 같이 자원을 반납하여야 합니다.
반납하지 않으면 경고가 뜨게 됩니다.
try with resources 문법으로 스캐너의 자원을 자동 반납하도록 코딩하세요. 
*/

