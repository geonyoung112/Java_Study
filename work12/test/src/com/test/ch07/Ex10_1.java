package com.test.ch07;

public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie c1 = new Movie("어벤져스");
		Movie.printInfo(c1);
		
		Movie c2 = new Movie("연애의 온도",180);
		Movie.printInfo(c2);
		
		Movie c3 = new Movie("아바타",180, "판타지");
		Movie.printInfo(c3);
	}

}

class Movie {
	String title;
	int hour;
	String gerne;
	
	Movie (String title) {
		this(title, 100, "액션");
	}
	
	Movie (String title, int hour) {
		this(title, hour, "로맨스");
	}
	
	Movie (String title, int hour, String gerne) {
		this.title = title;
		this.hour = hour;
		this.gerne = gerne;
	}
	
	
	
	static void printInfo(Movie c) {
		System.out.printf("제목: %s%n상영시간: %d%n장르: %s%n%n", c.title, c.hour, c.gerne);
	}
}
/*
문제 1.
이전 문제에서 작성한 영화 클래스의 생성자를 this를 사용하도록 수정하세요. 
*/