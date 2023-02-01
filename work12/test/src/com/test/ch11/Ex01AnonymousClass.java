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
				System.out.println(b1.getTitle() + "," + b1.getAuthor());
				System.out.println();
			}
		});
		
		b1.printInfo(new PrintService() {
			
			@Override
			public void print() {
				System.out.println("- 앱 알림으로 전송 -");
				System.out.println(b1.getTitle() + "," + b1.getAuthor());
				System.out.println();
			}
		});

	}

}

interface PrintService{
	public abstract void print();
}

class PrintServiceForPrinter implements PrintService {
	
	@Override
	public void print() {
		System.out.println("- 프린터로 출력 -");
		// (1)
		System.out.println("책 인스턴스가 필요합니다.");
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