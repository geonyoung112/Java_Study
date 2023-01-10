package com.test.ch03;

public class Ex07ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 75;
		
		String result = score >= 60? "합격" : "블합격";
		System.out.println(result);
		
		score = 48;
		System.out.printf("%s%n", score >= 60? "합격" : "불합격");

	}

}
