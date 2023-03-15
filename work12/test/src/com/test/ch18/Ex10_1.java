package com.test.ch18;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("< team1 >");
		Map<String, Integer> team1 = new HashMap<>();
		team1.put("A", 30);
		team1.put("B", 40);
		team1.put("C", 55);
		team1.put("D", 75);
		team1.put("E", 92);
		team1.put("E", 100);
		for (Map.Entry<String, Integer> e : team1.entrySet()) {
			System.out.println("이름: " + e.getKey() + "\t점수: " + e.getValue());
		}
		System.out.println();
		
		System.out.println("< team2 >");
		Map<String, Integer> team2 = new HashMap<>();
		team2.put("A", 64);
		team2.put("B", 74);
		team2.put("C", 90);
		team2.put("D", 55);
		team2.put("E", 92);
		team2.put("E", 26);
		for (Map.Entry<String, Integer> e : team2.entrySet()) {
			System.out.println("이름: " + e.getKey() + "\t점수: " + e.getValue());
		}
		System.out.println();
		
		
		//문제 1.
		System.out.println("< 두 반의 모든 학생들을 중복없이 출력하세요. >");
		Map<String, Integer> team3 = new HashMap<>();
		team3.putAll(team1);
		team3.putAll(team2);
		for (Map.Entry<String, Integer> e : team3.entrySet()) {
			System.out.println("이름: " + e.getKey() + "\t스킬: " + e.getValue());
		}
		System.out.println();
		
		
		//문제 2.
		System.out.println("< 점수가 90점 이상인 학생들을 맵에서 삭제 후 출력하세요. >");
		System.out.println("< team1 >");
		 Iterator<Entry<String, Integer>> delete = team1.entrySet().iterator();
	        while (delete.hasNext()) {
	            Entry<String, Integer> e = delete.next();
	            if (e.getValue() >= 90) {
	                delete.remove();
	            }
	        }
	        
	        for (Entry<String, Integer> e : team1.entrySet()) {
	            System.out.println("학생 번호: " + e.getKey() + ", 점수: " + e.getValue());
	        }
	        
	        System.out.println("< team2 >");
			 Iterator<Entry<String, Integer>> delete2 = team2.entrySet().iterator();
		        while (delete2.hasNext()) {
		            Entry<String, Integer> e = delete2.next();
		            if (e.getValue() >= 90) {
		                delete2.remove();
		            }
		        }
		        
		        for (Entry<String, Integer> e : team2.entrySet()) {
		            System.out.println("학생 번호: " + e.getKey() + ", 점수: " + e.getValue());
		        }
		        System.out.println();
	        

       
		
		//문제 3.
		System.out.println("< 55점인 학생 모두 맵에서 삭제하세요. >");
		Set<Integer> score = Collections.singleton(55);		
		team1.values().removeAll(score);
		team2.values().removeAll(score);
		System.out.println("team1: " + team1.keySet());
		System.out.println("team2: " + team2.keySet());
		System.out.println();
		
		
		//문제 4.
		System.out.println("< 100점인 학생이 존재하는 지 출력하세요. >");
		System.out.println("team1: " + team1.containsValue(100));
		System.out.println("team2: " + team2.containsValue(100));
	}
}

/*
문제 1.
1반 학생들의 이름, 점수가 저장된 맵과 2반 학생들의 이름, 점수가 저장된 맵을 만드세요.
두 반의 모든 학생들을 중복 없이 출력하세요.
문제 2.
점수가 90점 이상인 학생들을 맵에서 삭제 후 출력하세요.
문제 3.
55점인 학생 모두 맵에서 삭제하세요.
문제 4.
100점인 학생이 존재하는 지 출력하세요.
*/