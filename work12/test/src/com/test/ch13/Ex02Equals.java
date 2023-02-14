package com.test.ch13;

public class Ex02Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book3 b1 = new Book3("자바 컬렉션", "엘컴퓨터학원", 2);
		Book3 b2 = new Book3("자바 알고리즘", "엘컴퓨터학원", 7);
		Book3 b3 = new Book3("자바 알고리즘", "엘컴퓨터학원", 7);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1.equals(b2));
		System.out.println();
		
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b2.equals(b3));
		System.out.println();
		
		Book4 b4 = new Book4("자바 컬렉션", "엘컴퓨터학원", 2);
		Book4 b5 = new Book4("자바 알고리즘", "엘컴퓨터학원", 7);
		Book4 b6 = new Book4("자바 알고리즘", "엘컴퓨터학원", 7);
		
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b4.equals(b5));
		System.out.println();
		
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b5.equals(b6));
		System.out.println();
		
		String s1 = new String ("안녕하세요.");
		String s2 = new String ("안녕하세요.");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2)); //문자열 비교시엔 equals를 사용하기
				
		
		/*
		 * equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만,
		 * == 연산자는 비교하고자 하는 대상의 주소값을 비교합니다.
		*/

	}

}

class Book3 {
	private String title;
	private String author;
	private int edition;
	
	public Book3(String title, String author, int edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	//그냥 여기서 equals를 사용한다면 인스턴스 변수들이 같더라도 false로 반환한다.
	//각 인스턴스가 가지는 변수의 주소 값이 다르기 때문에 변수의 내용이 같더라도 다르다고 false 결과 값이 나온다.
	@Override
	public String toString() {
		return "Book3[title= " + title + ", author=" + author + ", edition = " + edition + "]";
	}
}

class Book4{
	private String title;
	private String author;
	private int edition;
	
	public Book4(String title, String author, int edition) {
		this.title = title;
		this.author = author;
		this.edition = edition;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book4))
			return false; //형변화이 가능한지 확인하는 코드: 불가하다면 false 값을 반환
		Book4 book = (Book4)obj;//다운캐스팅을 한 후 
		
		//object의 equals를 이용해 각 인스터스 변수들의 값이 같을때 true를 반환하도록한다.
		return title.equals(book.title) && author.equals(book.author) && edition == book.edition;
	}
	
	@Override
	public String toString() {
		return "Book4 [title=" + title + ", author = " + author + ", edition =" + edition + "]";
		
	}
}


/*
문제 1.
원하는 클래스를 만드세요.
인스턴스 두 개를 생성하세요.
equals 메소드를 오버라이딩하여 인스턴스 변수들의 값이 모두 같을 시 true 를 반환하도록 코딩하세요. 
*/