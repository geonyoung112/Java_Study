package com.test.ch14;

import java.util.Arrays;

public class Ex03StringUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "엘컴퓨터학원";
		String s2 = "엘컴퓨터학원";
		//compareTo는 자주 사용함 (중요)
		//compareTo은 스트링 인트 등에 comparable이 기본적으로 오버라이딩 되어있고
		//오버라이딩을 한 후 compareTo룰 사용할 수 있다.
		//크기, 대소를 비교하고 결과값을 출력함
		System.out.println(s1.compareTo(s2));
		s2 = "자바 기본문법"; //ㅇ 보다 ㅈ이 뒤에 있어 더 큼 (오른쪽이 더크면 음수로 반환/ 작으면 양수/ 같으면 0): 오른쪽이 크면 왼쪽으로 옮겨주는 솔트? 메소드도 있음
		System.out.println(s1.compareTo(s2));
		s2 = "가나다라";
		System.out.println(s1.compareTo(s2));
		System.out.println();
		
		s1 = "엘컴퓨터학원";
		System.out.println(s1.contains("컴퓨터")); //해당 문구를 포함하는지
		System.out.println(s1.contains("자바"));
		System.out.println();
		
		s1 = "엘컴";
		s2 = "퓨터학원";
		System.out.println(s1.concat(s2)); //두 인스턴스를 붙여줌 
		System.out.println();
		
		s1 = "엚컴퓨터학원 자바 기본문법";
		s2 = "자바 기본문법 엘컴퓨터학원";
		System.out.println(s1.startsWith("엘")); //시작에 엘이 있는지
		System.out.println(s2.startsWith("엘"));
		System.out.println(s1.endsWith("원"));//끝에 원이 있는지
		System.out.println(s2.endsWith("원"));
		System.out.println();
		
		s1 = "Quit";
		System.out.println("quit");
		System.out.println(s1.equalsIgnoreCase("quit")); //대소문자 상관없이 같은 지 비교
		System.out.println();
		
		s1 = "안녕하세요!! 엘컴퓨터!! 학원!! 입니다.!!!";
		System.out.println(s1);
		System.out.println(s1.replace("!", "")); //!를 제거하고 ""을 넣기
		System.out.println();
		
		
		//자바의 정규화_회원가입시 유효성을 체크하기 위해 사용
		s1 = "안녕하세요12 엘컴퓨처34학원56입니다.7890";
		System.out.println(s1);
		System.out.println(s1.replaceAll("[0-9]", "")); //숫자제거
		
		s1 = "자바 기본문법";
		int i = 75300000;
		double pi = 3.14159265359;
		System.out.println(String.format("%20s", s1)); //20글자로 작성 구문 위치 조정시 사용
		System.out.println(String.format("%,d", i)); //금액 작성시 ,를 찍게 함
		System.out.println(String.format("%#6.3f", pi));//소숫점 3자리까지 (#은 0이 아닌 공백으로 남겨둠)
		System.out.println(String.format("%06.3f", pi));//0으로 적음
		System.out.println();
		
		s1 = "ABCDEfghiJKlmN";
		System.out.println(s1.toLowerCase());//소문자로 결과
		System.out.println(s1.toUpperCase());//대문자로 결과
		System.out.println();
		
		s1 = "  A BC def GH I   ";
		System.out.println("[" + s1.trim() + "]"); //사용자 양쪽 공백 입력시 제거
		System.out.println();
		
		s1 = "자바 기본문법 엘컴퓨터학원알고리즘";
		System.out.println(s1.substring(8)); //8자리 부터 출력
		System.out.println(s1.substring(8, 14)); //8자리부터 14자리 전까지
		System.out.println();
		
		s1 = "엘컴퓨터학원";
		char[] chArr = s1.toCharArray(); //한글자식 출력
		for (int j=0; j<chArr.length; j++) {
			System.out.println(chArr[j]);
		}
		System.out.println();
		
		s1 = "자바  기본    문법  엘 컴퓨터 학원 ";
		String[] strArr1 = s1.split(" +"); //여러개 공백 기준으로 자르기
		System.out.println(Arrays.toString(strArr1));
		strArr1 = s1.split(" +", 3); //3개의 배열로 나누기
		System.out.println(Arrays.toString(strArr1));
		System.out.println();
		
		s1 = "asdfasdf";
		System.out.println(s1.matches("[a-z]")); //한글자만 확인
		System.out.println(s1.matches("[a-z]+")); //여러글자
		s1 = "12341234";
		System.out.println(s1.matches("[0-9]+")); //숫자만
		s1 = "12341zz234";
		System.out.println(s1.matches("[0-9]+")); //숫자만
		System.out.println();
		
		String[] strArr2 = {"자바", "기본문법", "엘컴퓨터", "학원"};
		System.out.println(String.join(", ", strArr2)); //배열을 조인해서 보여줌
		System.out.println();
		

	}

}

/*
문제 1.
동해물과 백두산이 마르고 닳도록 하느님이 보우하사 우리나라 만세
위 문장에서 substring 을 사용하여 "하느님이" 부터 끝까지 출력하세요.
문제 2.
위 문장을 split을 사용하여 공백을 기준으로 배열로 만든 뒤 
배열의 맨 뒤에서 앞으로 요소들을 출력하세요.
문제 3.
동해물
백두산
두 문자열 중 더 큰 문자열을 출력하세요.
힌트) compareTo를 사용하세요.
*/