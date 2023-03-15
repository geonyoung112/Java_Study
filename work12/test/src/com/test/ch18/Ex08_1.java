package com.test.ch18;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ex08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Deque<String> messageinput = new ArrayDeque<>();
		
		while(true) {
			System.out.println("메세지를 입력하세요: ");
			String message = scanner.nextLine();
			
			if(message.equals("quit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
				//equals 이용하기
			}
			messageinput.add(message);
			
			if(messageinput.size() > 3) {
				messageinput.pop();
				//3보다 커지면 먼저 입력된 값들을 지운다
				//quit를 입력하면 종료되기 때문에 구현을 위해 break을 입력하지 않는다.
			}
		}
		System.out.println("마지막으로 입력된 3개의 메세지를 출력합니다.");
		for(String message: messageinput) {
			System.out.println(message);
		}
	
	}

}

/*
문제 1.
반복문을 이용해 사용자가 입력한 메세지들을 저장하세요. 
마지막으로 입력한 메세지 세개만 화면에 출력되도록 코딩하세요.
quit가 입력되면 반복문은 종료되어야 합니다.
*/