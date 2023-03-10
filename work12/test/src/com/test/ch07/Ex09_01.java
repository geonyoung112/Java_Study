package com.test.ch07;

public class Ex09_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cinema c1 = new Cinema("어벤져스");
		c1.printInfo();
		
		Cinema c2 = new Cinema("연애의 온도",180);
		c2.printInfo();
		
		Cinema c3 = new Cinema("아바타",180, "판타지");
		c3.printInfo();

	}

}

class Cinema {
	String title;
	int hour;
	String gerne;
	
	Cinema (String title) {
		this.title = title;
		this.hour = 400;
		this.gerne = "액션";
	}
	
	Cinema (String title, int hour) {
		this.title = title;
		this.hour = hour;
		this.gerne = "로맨스";
	}
	
	Cinema (String title, int hour, String gerne) {
		this.title = title;
		this.hour = hour;
		this.gerne = gerne;
	}
	
	
	
	void printInfo() {
		System.out.printf("제목: %s%n상영시간: %d%n장르: %s%n%n", title, hour, gerne);
	}
}

/*
문제 1.
영화 제목(문자열), 상영시간(정수), 장르(문자열) 속성을 가진 클래스를 만들고 
생성자를 이용하여 속성을 설정한 뒤 출력하세요.
문제 2.
생성자 오버로딩을 이용해 생성자 세개를 추가하고
각각의 생성자를 이용하여 3개의 인스턴스를 생성후 정보를 출력하세요.  
*/