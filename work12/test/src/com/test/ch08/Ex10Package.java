package com.test.ch08;

import com.test.ch08.ex10.Book;


public class Ex10Package {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setTitle("엘컴퓨터학원");
		System.out.println(book.getTitle());
	}

}
//package와 클래스
//클래스를 패키지에 감싸서 만들면 예를들어 다른 회사끼리 같은 클래스이름으로 저장해도 따로 import하며 사용할 수 있다.
//이는 com.google, com.naver와 같이 패키지에 감싼 클래스는 고유한 도메인, url을 가지기 때문이다.

//*추가 자바의 접근 제어자는 class에도 사용할 수 있다.

/*
문제 1. o
com.test.book 패지키를 생성하세요.
위 패키지에 Book 클래스를 생성한 뒤 속성과 메소드를 추가하세요.
com.test.main 패키지를 생성하세요.
위 패키지에 BookTest 클래스를 생성한 뒤 main 메소드를 생성하세요.
main 메소드에서 Book클래스의 메소드를 호출하여 반환된 값을 출력하는 코드를 작성하세요. 
*/