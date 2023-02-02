package com.test.ch11;

public class Ex01AnonymousClass {
	// 익명 클래스
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book();
		b1.setTitle("자바 익명클래스란");
		b1.setAuthor("엘컴퓨터학원");
		
		PrintService ps = new PrintServiceForPrinter();
		b1.printInfo(ps);
		
		Book b2 = new Book();
		b2.setTitle("만화로 배우는 자바");
		b2.setAuthor("엘컴퓨터학원");

		//위 아래 코드는 같은 내용
		//사용하는 메소드가 자주 사용되는 것이 아닌 일회성에서 끝난다면 익명클래스를 사용한다.
		//굳이 일회성 메소드라면 클래스와 인스턴스를 생성하는 것이 번거롭다.
		
		/*그래서 익명클래스를 통해 바로 메소드를 정의한다. 
		이 경우엔 직관적으로 메소드 코드를 볼수 있고 효율적인 코드 작성이 가능하다
		여기서 익명클래스보다 더 짧게 작성가능한 람다가 있다.
		긴 코드의 경우 익명클래스, 짧은 코드의 경우 람다로 작성한다.
		익명클래스는 자주 사용되기 때문에 중요한 개념
		*/
		
		b1.printInfo(new PrintService() {
			
			@Override
			public void print() {
				System.out.println("- FAX로 전송 -");
				System.out.println(b1.getTitle() + ", " + b1.getAuthor());
				System.out.println();
			}

			@Override
			public void print(Book b) {
				// TODO Auto-generated method stub
				
			}
		});
		
		b1.printInfo(new PrintService() { //지역변수 없이 사용가능
			
			@Override
			public void print() {
				System.out.println("- 앱 알림으로 전송 -");
				System.out.println(b2.getTitle() + ", " + b2.getAuthor()); //지역변수 없이 사용가능
				System.out.println();
			}

			@Override
			public void print(Book b) {

			}
		});
		
		b1.createBook(new Device() {

			@Override
			public void create() {
				// TODO Auto-generated method stub
				System.out.println("- 이북 생성 -");
				System.out.println(b1.getTitle() + ", " + b1.getAuthor());
				System.out.println(); 
			}
			
		});
		
		b1.createBook(new Device() {

			@Override
			public void create() {
				// TODO Auto-generated method stub
				System.out.println("- 종이책 생성 -");
				System.out.println(b2.getTitle() + ", " + b2.getAuthor());
				System.out.println();
			}
			
		});
	}

}

interface PrintService{
	public abstract void print();
	public abstract void print(Book b);
	//익명 클래스는 파라미터를 받지 않아도 메인 메소드에 존재하기에 그 안에 있는 
	//인스턴스는 다 사용가능하다: 익명클래스의 이점
	
	//하지만 기존의 인터페이스 사용하기 위해선 파라미터로 불러와야 한다.
}

interface Device{
	public abstract void create();
}

class PrintServiceForPrinter implements PrintService {
	
	@Override
	public void print() {
		System.out.println("- 프린터로 출력 -");
		System.out.println("책 인스턴스가 필요합니다.");
		System.out.println();
	}
	
	@Override
	public void print(Book b) {
		System.out.println("- 프린터로 출력 -");
		System.out.println("책 제목: " + b.title );
		System.out.println("책 저자: " + b.author);
		System.out.println();
	}
}

class Book {
	String title;
	String author;
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void printInfo(PrintService ps) {
		ps.print();
	}
	
	public void createBook(Device de) {
		de.create();
	}
}
/*
문제 1.
(1)에 책 정보가 출력될 수 있도록 코딩하세요.
힌트) 인터페이스에 print(Book book) 메소드 오버로딩이 필요 합니다.

문제 2.
Book 클래스에 createBook 메소드를 추가하세요.
Device 인터페이스를 작성하세요.
Device 인터페이스에 create 추상 메소드를 선언하세요. 
main 메소드에서 익명클래스를 사용하여 "이북 생성", "종이책 생성"을 출력하세요.
*/