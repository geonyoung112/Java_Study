package com.test.ch11;

//변수 호출후 사용가능한 영역 살피기
public class Ex07Scope {
	static int iv = 2;//처음 선언된 iv 변수는 클래스 영역 안에서 모두 사용가능
	static int k = 3;
	
	public static void main(String[] args) {
		System.out.println("메소드 호출 전");
		
		System.out.printf("iv = %d%n", iv);
		//System.out.printf("param = %d%n", param);
		//System.out.printf("local = %d%n", local);
		//System.out.printf("i = %d%n", i);
		//System.out.printf("j = %d%n", j);
		System.out.printf("k = %d%n", k);
		System.out.println();
		
		testScope(5);
		
		System.out.println("메소드 호출 후");
		
		System.out.printf("iv = %d%n", iv);
		//System.out.printf("param = %d%n", param);
		//System.out.printf("local = %d%n", local);
		//System.out.printf("i = %d%n", i);
		//System.out.printf("j = %d%n", j);
		System.out.printf("k = %d%n", k);
		System.out.println();
	}
	//param은 이전 선언된 5라는 숫자를 받아온 지역변수로서 이때부터 사용가능
	public static void testScope(int param) { //staic void 같이?
		System.out.println("메소드 시작");
		
		int local = 7; //로컬도 마찬가지 메소드가 끝날때까지 사용가능
		System.out.printf("iv = %d%n", iv);
		System.out.printf("param = %d%n", param);
		System.out.printf("local = %d%n", local);
		//System.out.printf("i = %d%n", i);
		//System.out.printf("j = %d%n", j);
		System.out.printf("k = %d%n", k);
		System.out.println();
		
		for (int i=0; i<1; i++) { // i도 메소드가 끝나기 전까지
			System.out.println("i for문 시작");
			
			System.out.printf("iv = %d%n", iv);
			System.out.printf("param = %d%n", param);
			System.out.printf("local = %d%n", local);
			System.out.printf("i = %d%n", i);
			//System.out.printf("j = %d%n", j);
			System.out.printf("k = %d%n", k);
			System.out.println();
			
			for (int j=0; j<1; j++) { //j도 메소드가 끝나기 전까지
				System.out.println("j for문 시작");
				
				System.out.printf("iv = %d%n", iv);
				System.out.printf("param = %d%n", param);
				System.out.printf("local = %d%n", local);
				System.out.printf("i = %d%n", i);
				System.out.printf("j = %d%n", j);
				System.out.printf("k = %d%n", k);
				System.out.println();
				
				if (i == 0) {
					System.out.println("if문 시작");
					
					//int k = 7;
					System.out.printf("iv = %d%n", iv);
					System.out.printf("param = %d%n", param);
					System.out.printf("local = %d%n", local);
					System.out.printf("i = %d%n", i);
					System.out.printf("j = %d%n", j);
					System.out.printf("k = %d%n", k);
					System.out.println();
					
					System.out.println("if문 종료\n");
				}
				
				System.out.printf("iv = %d%n", iv);
				System.out.printf("param = %d%n", param);
				System.out.printf("local = %d%n", local);
				System.out.printf("i = %d%n", i);
				System.out.printf("j = %d%n", j);
				System.out.printf("k = %d%n", k);
				System.out.println();
				
				System.out.println("j for문 종료\n");
			}
			
			System.out.printf("iv = %d%n", iv);
			System.out.printf("param = %d%n", param);
			System.out.printf("local = %d%n", local);
			System.out.printf("i = %d%n", i);
			//System.out.printf("j = %d%n", j);
			System.out.printf("k = %d%n", k);
			System.out.println();
			
			System.out.println("i for문 종료\n");
		}
		
		System.out.printf("iv = %d%n", iv);
		System.out.printf("param = %d%n", param);
		System.out.printf("local = %d%n", local);
		//System.out.printf("i = %d%n", i);
		//System.out.printf("j = %d%n", j);
		System.out.printf("k = %d%n", k);
		System.out.println();
		
		System.out.println("메소드 종료");
	}
	
}

/*
문제 1.
변수 k가 testScope 메소드 호출 뒤에도 출력될 수 있게 수정하세요.
*/
