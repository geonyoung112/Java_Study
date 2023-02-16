package com.test.ch14;

public class Ex02IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "자바 기본문법 엘컴퓨터학원 자바 알고리즘 엘컴퓨터학원 자료구조";
		String target = "엘컴퓨터학원";
		System.out.println(s1.indexOf(target)); 		//한칸씩 세어져서 결과값이 나옴(왼쪽 기준)
		System.out.println(s1.lastIndexOf(target)); 	//오른쪽부터 확인
		
		String s2 = "[엘컴퓨터학원] 자바 기본문법!! (자료구조) ";
		String filter = "[]()";
		String result = "";
		for(int i=0; i<s2.length(); i++) {
			char ch = s2.charAt(i); 			//한 글자씩 세어 저장하고
			
			if(filter.indexOf(ch) == -1) {
				result += String.valueOf(ch); 	//필터에 있는 값과 다르다면 결과값에 저장
			}
		}
		System.out.println(result);
		System.out.println();
		
		s2 = "엘, 컴, 퓨, 터, 학, 원, 자바 기본, 문, 법,,";
		target = ",";
		int pos = 0;
		int count = 0;
		while( (pos = s2.indexOf(target, pos)) != -1) { //포스에 콤마가 있다면 그 수를 저장한다.
			pos += target.length(); 
			//다만 배열에 저장한다. 
			//그렇지 않으면 다시 처음부터 콤마 여부를 확인하기 때문에 그 다음 콤마를 확인하지 못한다.
			count++; //그 수를 세고 결과값을 가져온다.
		}
		System.out.println(count);

	}

}

/*
문제 1.
"안녕하세요, 엘컴#퓨터@@학원 입니다.!~%"
위 문자열에서 ,@!~%# 문자를 제거한 뒤 출력하는 프로그램을 코딩하세요.
문제 2.
위 문자열에서 공백의 수를 카운팅하여 출력하세요.
*/