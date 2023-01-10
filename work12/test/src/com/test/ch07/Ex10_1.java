package com.test.ch07;

public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie c1 = new Movie("�뼱踰ㅼ졇�뒪");
		Movie.printInfo(c1);
		
		Movie c2 = new Movie("�뿰�븷�쓽 �삩�룄",180);
		Movie.printInfo(c2);
		
		Movie c3 = new Movie("�븘諛뷀�",180, "�뙋��吏�");
		Movie.printInfo(c3);
	}

}

class Movie {
	String title;
	int hour;
	String gerne;
	
	Movie (String title) {
		this(title, 100, "�븸�뀡");
	}
	
	Movie (String title, int hour) {
		this(title, hour, "濡쒕㎤�뒪");
	}
	
	Movie (String title, int hour, String gerne) {
		this.title = title;
		this.hour = hour;
		this.gerne = gerne;
	}
	
	
	
	static void printInfo(Movie c) {
		System.out.printf("�젣紐�: %s%n�긽�쁺�떆媛�: %d%n�옣瑜�: %s%n%n", c.title, c.hour, c.gerne);
	}
}
/*
臾몄젣 1.
�씠�쟾 臾몄젣�뿉�꽌 �옉�꽦�븳 �쁺�솕 �겢�옒�뒪�쓽 �깮�꽦�옄瑜� this瑜� �궗�슜�븯�룄濡� �닔�젙�븯�꽭�슂. 
*/