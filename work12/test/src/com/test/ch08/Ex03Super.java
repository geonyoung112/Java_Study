package com.test.ch08;

public class Ex03Super {
	
	/*this 와 super를 사용하는 이유
	 *  프로그래밍을 하다보면 자식생성자와 부모생성자의 변수 혹은 메서드의 이름이 같은 경우 구분을 해줘야한다.
	 *  구분을 할 때 this와 super를 사용하여 구분을 지을 수 있다.
	 *  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook2 eb = new EBook2();
		System.out.println("책의 체목은 [" + eb.title + "] 이고 글자색은 [" + eb.fontColor + "] 입니다.");

	}

}
class Book3 {
	String title;
	String author;
	int price;
	
	Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	/*
	Book3() {
		
	}
	*/
}

class EBook2 extends Book3 {
	String fontColor;
	
	EBook2() {
		//super()는 자식클래스의 멤버가 부모 클래스 멤버를 사용할 수 있기 때문에 
		//부모의 멤버들이 먼저 초기화 되어 있어야 한다.
		//또한, 생성자를 첫줄에 호출해야한다. 하지 않으면 컴파일러가 자동으로 super()를 생성자의 첫줄에 삽입한다.
		super("언어 문법", "엘컴퓨터학");
		this.fontColor = "블랙";
	}
}

/*
문제 1.
이전 문제에서 작성한 부모 클래스에 기본 생성자를 없애면 컴파일 에러가 발생합니다. 
super를 사용하여 컴파일 에러가 나지 않도록 수정하세요. 
*/


