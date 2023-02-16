package com.test.ch14;

public class Ex01StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "엘컴퓨터학원";				// String 리터럴
		String s2 = "엘컴퓨터학원";
		
		//코드마다 상수풀이 존재하는데 = 으로 스트링을 생성하게 된다면,
		//같게 쓰여진 코드내용이 있다면 그걸 가져와서 사용한다. 
		//그래서 해쉬코드도 같다고 나온다.
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println();
		
		String s3 = new String("엘컴퓨터학원");
		String s4 = new String("엘컴퓨터학원");
		// 스트링을 매번 새롭게 인스턴스를 생성한다면
		//같은 내용을 담고있더라도 아이덴티티 해쉬코드는 같지않다.
		
		//위와 같은 내용을 통해 스트링을 비교할땐 == 이 아닌 equals로 비교해야한다.
		//이처럼 주소값이 같은 경우가 있기 때문이다.
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println();
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s3.intern()));
		//intern은 이전에 사용된 같은 코드가 있다면 그 최초의 값을 가져온다.
		//그래서 s1의 값을 가져온다.
		System.out.println();
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);   //새로운 인스턴스 생성방식
		System.out.println(s3.equals(s4)); //내용이 같은 걸 비교
		System.out.println(s1.equals(s2)); //내용이 같은 걸 비교
		System.out.println();
		
		String s5 = null;     //빈값이 들어있는 변수는 메소드를 같이 호출헤서 사용한다.
		//System.out.println(s5.length());
		String s6 = "";      //이처럼
		System.out.println(s6.length());
		

	}

}

/*
문제 1.
== 과 equals 의 차이를 설명할 수 있는 예제를 작성하세요.
*/