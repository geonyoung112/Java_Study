package com.test.ch08;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker w1 = new Worker();
		w1.name = "주건영";
		w1.age = 25;
		w1.year = "신입";
		w1.salary = 300;
		
		Worker w2 = new Worker();
		w2.name = "홍길동";
		w2.age = 30;
		w2.year = "대리";
		w2.salary = 400;
		
		Company com = new Company();
		com.putworker(com.wk);
		Company.print(w1);
		
		com.putworker(w1, w2);
		Company.print(com.wks);
		
	}

}

class Company {
	Worker wk;
	Worker[] wks;
	String name;
	String rank;
	
	Company(String name) {
		
	}
	


	void putworker(Worker wk) {
		this.wk = wk;
	}
	
	void putworker(Worker... wks) {
		this.wks = wks;
	}
	
	static void print (Worker wk) {
		System.out.println("--신입--");
		System.out.println(wk.print());
		System.out.println();
	}
	
	static void print(Worker... wks) {
		System.out.println("--전체--");
		if (wks != null) {
			for(int i=0; i<wks.length; i++) {
				System.out.println(wks[i].print());
			}
		}
	}
	
	
	Company() {
		
	}
	
	
}

//has 관계에는 extends 작성할 필요없다
class Worker {
	String name;
	int age;
	String year;
	int salary;
	
	
	Worker() {
		super();
		this.name = "홍윤아";
	}
	
	String print() {
		return "이름: " + name + " 나이: " + age + " 직급: " + year + " 월급: " + salary;
	}
}


/*
문제 3_1.
이전 문제에서 작성한 부모 클래스에 기본 생성자를 없애면 컴파일 에러가 발생합니다. 
super를 사용하여 컴파일 에러가 나지 않도록 수정하세요. 
*/

/*
문제 1.
생각나는 개체를 이용하여 클래스들을 만들고 HAS-A 관계를 표현해주세요. (회사: 이름 직급 근속기간 연봉 등)
*/