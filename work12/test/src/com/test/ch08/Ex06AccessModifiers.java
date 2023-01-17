package com.test.ch08;

import com.test.ch08.ex06.Book22;

public class Ex06AccessModifiers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book22 b1 = new Book22();
		//b1.setTitle("자바기본문법");
		b1.setTitle("자바기본문법");
		System.out.println(b1.getTitle());
		
		//b1.author = "엘컴퓨터학원";
		b1.setAuthor("엘컴퓨터학원");
		//System.out.println(b1.author);
		System.out.println(b1.getAuthor());
		
		b1.setPrice(50000);
		System.out.println(b1.getPrice());
		//b1.setDollarPrice(50000);
		System.out.println(b1.getDollarPrice());

		//b1.edition = 3;
		
		//b1.tax = 1.1f;
		//b1.setTax(1.1f);
		
		EBook5 eb1 = new EBook5();
		eb1.setPrice(30000);
		//eb1.tax = 1.1f;
		eb1.setTax(1.1f);
		System.out.println("세금 적용된 가격: " + eb1.getPrice( )* eb1.getTax());
		
		
		
		
		
	}

}
class EBook5 extends Book22 {
	String fontColor;
	protected int price;

	
	void setEdition(int edition) {
		this.edition = edition;
	}
	
	
	@Override
	protected void setTax(float tax) {
		this.tax = tax+0.1f;
	}
	
	@Override
	protected float getTax() {
		return tax;
	}
	
	/* 오버라이딩: 
	부모 클래스로부터 상속받은 메서드의 내용을 변경하는것으로 
	메서드의 선언부는 부모의 것과 완전히 일치해야함
	  이름, 파라미터, 반환타입 같아야함 */
	
	@Override
	public void setPrice(int price) {
		super.price = price;
		this.price = price - 5000;
		setDollarPrice(price);
	}
	
	@Override
	public int getPrice() {
		return this.price;
	}
}

/*
 * 젒근제어자: 변수와 함수, 클래스에 대한 접근을 제한하는 문법
 * 접근을 제한하는 이유는 객체가 가진 고유의 멤버 변수값들이 외부에서 잘못 변경되는 것을 막기 위해서입니다. 
 * 사전에 멤버 변수와 함수들의 성격을 규정하고 차단함으로써 의도치 않은 실수를 줄이기 위한 의도가 깔려 있습니다. 
 * 
접근 허용 가능 범위 순서: public > protected > default > private

	1. public : 접근을 제한이 없음
	2. protected : 동일한 패키지 내에 존재하거나 파생클래스에서만 접근 가능
	3. default : 아무런 접근 제한자를 명시하지 않으면 default 값이 되며, 동일한 패키지 내에서만 접근이 가능
	4. private : 자기 자신의 클래스 내에서만 접근이 가능
 */

	
/*
문제1. o
setEdition 메소드의 오류를 수정하세요.

문제2. o
Book클래스의 title 변수를 private로 수정 후 발생되는 main메소드의 오류를 수정하세요. 

문제3. o
EBook5 클래스의 setPrice 메소드를 오버라이딩 하세요.
e북은 입력된 가격보다 5000원 낮은 금액으로 price가 설정되어야 합니다.
setPrice 메소드 내에서 setDollarPrice 메소드를 호출하여 dollarPrice를 설정하세요.
setDollarPrice 메소드는 상속관계가 아닌 클래스에서 접근할 수 없어야 합니다.
힌트) setDollarPrice메소드와 dollarPrice 변수의 접근 제한자를 수정하세요.
*/