package com.test.ch18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Ex11_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentt s1 = new Studentt("A");
		s1.addTest(new Test("국어", 81, 2));
		s1.addTest(new Test("수학", 53, 1));
		
		Studentt s2 = new Studentt("B");
		s2.addTest(new Test("영어", 92, 3));
		s2.addTest(new Test("수학", 81, 4));
		
		List<Studentt> team1 = new ArrayList<>();
		team1.add(s1);
		team1.add(s2);
		
		Studentt s3 = new Studentt("C");
		s3.addTest(new Test("과학", 47, 1));
		s3.addTest(new Test("영어", 66, 1));
		
		Studentt s4 = new Studentt("D");
		s4.addTest(new Test("사회", 70, 5));
		s4.addTest(new Test("국어", 77, 6));
		
		Studentt s5 = new Studentt("E");
		s5.addTest(new Test("수학", 80, 2));
		s5.addTest(new Test("한국사", 90, 3));
		
		List<Studentt> team2 = new ArrayList<>();
		team2.add(s3);
		team2.add(s4);
		team2.add(s5);

		Grade grade = new Grade();
		grade.addGrade(1, team1);
		grade.addGrade(2, team2);
		
		grade.printTeamAll();
	}

}

class Grade {
	Map<Integer, List<Studentt>> gradeMap;
	public Grade() {
		gradeMap = new HashMap<>();
	}
	public void addGrade(Integer gradeName, List<Studentt> grade) {
		gradeMap.put(gradeName, grade);
	}
	public void printTeamAll() {
		for (Entry<Integer, List<Studentt>> entry : gradeMap.entrySet()) {
			for (Studentt stu : entry.getValue()) {
				System.out.println(stu.getName());
				for (Test t : stu.getTests()) {
					System.out.println(t.getSub() +", " + t.getScore() + ", " + t.getNum());
				}
				System.out.println("---");
			}
			
		}
	}
	
}

class Studentt {
	private String name;
	private List<Test> tests;
	
	public Studentt(String name) {
		this.name = name;
		tests = new ArrayList<>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Test> getTests() {
		return tests;
	}
	public void addTest(Test test) {
		tests.add(test);
	}
}

class Test {
	private String subject ;
	private int score;
	private int num;
	
	public Test(String subject, int score, int num) {
		this.subject = subject;
		this.score = score;
		this.num = num;
	}
	public String getSub() {
		return subject;
	}
	public void setSub(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

/*
문제 1.
반별 학생 목록을 저장하는 맵을 작성하세요.
학생들은 자신의 모의고사 점수들을 리스트로 갖습니다. 
학생마다 치른 모의고사 횟수는 다를 수 있습니다.
모든 반의 학생과 각 학생이 치른 모의고사들의 점수를 출력하세요.
위의 예제와 같이 클래스를 사용하여 코딩하세요.
*/