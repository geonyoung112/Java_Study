package com.test.ch11;

public class Ex06StaticBlock {

	//정적 초기화 블록
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart.print();
		
		Book3 b1 = new Book3();
		Book3 b2 = new Book3("자바 초기화 블럭");
		Book3 b3 = new Book3("자바 static에 대하여", "엘컴퓨터학원");
		
		Cart.add(b1);
		Cart.add(b2);
		Cart.add(b3);
		
		Cart.print();

	}

}

class Cart{
	public static Book3[] books = new Book3[5];
	private static int index = 0;
	
	//static(클래스) 초기화 블럭
	//static은 인스턴스 생성과 동시에 올라가는 것이 아닌 실행하면 바로 올라간다.
	//그래서 이를 수성하거나 추가하기 위해 static 초기화 블럭을 생성하여 사용한다.
	/*
	 * 초기화 블록은 생성자보다 먼저 호출되며, static 키워드의 유무에 따라 다음과 같이 구분할 수 있습니다.
	 * 1. 인스턴스 초기화 블록 
	 * 2. 클래스 초기화 블록
	 * 이러한 초기화 블록에는 다양한 명령문 및 제어문을 사용할 수 있으므로, 복잡한 초기화를 해야 할 경우 유용하게 사용됩니다.
	 * 
	 * 멤버 변수 초기화 순서
	 * 시점:
	 * 스태틱 변수 - 클래스가 로딩될 때 딱 한번 초기화
	 * 인스턴스 변수 - 인스턴스가 생성될 때마다 각 인스턴스 별로 초기화
	 * 순서:
	 * 스태틱변수 - 기본값 → 명시적 초기화 → 클래스 초기화 블럭
	 * 인스턴스 변수 - 기본값 → 명시적 초기화 → 인스턴스 초기화 블럭 → 생성자
	 */
	static {
		Book3 book = new Book3();
		book.setTitle("비어있음");
		book.setAuthor("비어있음");
	
		for(int i=0; i<books.length; i++) {
			books[i] = book;
		}
	}
	
	public static void print() {
		for (int i=0; i<books.length; i++) {
			books[i].print();
		}
		System.out.println();
	}
	
	public static void add(Book3 book) {
		books[index] = book;
		index++;
	}
}

class Book3 {
	private String title;
	private String author;
	private static int sequence = 0;
	private int bookNo;
	
	{
		bookNo = ++sequence;
	}//인스턴스 초기화 블럭:  생성자보다 먼저 올라가고 싶을 때 사용 (흔하게 사용하진 않음)
	
	Book3() {
		this("비어있음", "비어있음");
	}
	
	Book3(String title) {
		this(title, "작가미상");
	}
	
	Book3(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
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
	public void print() {
		System.out.println(bookNo + ", " + title + ", " + author);
	}
}

/*
문제 1.
정적 초기화 블록과 인스턴스 초기화 블록을 사용한 예제를 작성하세요.
문제 2.
정적 초기화 블럭에서는 인스턴스 변수를 사용할 수 없습니다.
이유를 설명하세요.
스태틱 블럭은 객체가 생성되기 이전에 수행되므로 인스턴스 멤버에 접근할 수 없다.
*/