package com.test.ch18;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Ex09_1 {
	public static void main(String[] args) {
		NavigableSet<Integer> score = new TreeSet<>();
		score.add(68);
		score.add(60);
		score.add(25);
		score.add(15);
		score.add(44);
		score.add(51);
		score.add(32);
		score.add(74);
		score.add(81);
		score.add(99);
		
		int student = 60;
		System.out.println("< 60점 이상인 학생들의 점수 >");
		NavigableSet<Integer> availableSet = score.tailSet(student, true); 
		//자기 자신도 포함
		System.out.println(availableSet);

		System.out.println("< 학생들의 시험 점수 중 가장 높은 학생의 점수 > ");
		System.out.println(score.pollLast());
		
		System.out.println("< 80점 보다 가장 근접하게 높은 점수 >");
		System.out.println(score.higher(80));
		
		System.out.println("< 75점을 찾아 출력하세요. 없다면 75점보다 가장 근접하게 낮은 점수를 출력하세요. >");
		System.out.println(score.floor(75));
		
	}
}

/*
문제 1.
60점 이상인 학생들의 점수를 출력하세요. 60점을 포함합니다.
문제 2.
학생들의 시험 점수 중 가장 높은 학생의 점수를 출력하세요.
문제 3.
80점 보다 가장 근접하게 높은 점수를 출력하세요.
문제 4.
75점을 찾아 출력하세요. 없다면 75점 보다 가장 근접하게 낮은 점수를 출력하세요.
*/