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
		System.out.printf("제목:  %s%n 가격: %d%n 저자: %s%n%n", c.title, c.hour, c.gerne);
	}
}
/*
臾몄젣 1.
�씠�쟾 臾몄젣�뿉�꽌 �옉�꽦�븳 �쁺�솕 �겢�옒�뒪�쓽 �깮�꽦�옄瑜� this瑜� �궗�슜�븯�룄濡� �닔�젙�븯�꽭�슂. 
*/