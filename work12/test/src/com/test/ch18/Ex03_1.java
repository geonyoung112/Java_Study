package com.test.ch18;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

//chat gpt가 작성해준 코드
public class Ex03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        List<List<Integer>> nestedList = new ArrayList<>();

        // 중첩 리스트에 값을 입력합니다.
        for (int i = 0; i < 2; i++) {
            List<Integer> innerList = new ArrayList<>();
            System.out.printf("%d번째 리스트에 저장될 값을 입력하세요.%n", i+1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d번째 값: ", j+1);
                int value = scanner.nextInt();
                innerList.add(value);
            }
            nestedList.add(innerList);
        }

        // 중복을 제거합니다.
        Set<Integer> set = new HashSet<>();
        for (List<Integer> innerList : nestedList) {
            set.addAll(innerList);
        }

        // 중첩 리스트에 저장된 값을 출력합니다.
        System.out.println("입력한 값 중복 제거 후 출력");
        for (int i = 0; i < nestedList.size(); i++) {
            List<Integer> innerList = nestedList.get(i);
            System.out.printf("%d번째 리스트: ", i+1);
            for (int j = 0; j < innerList.size(); j++) {
                int value = innerList.get(j);
                if (set.contains(value)) {
                    System.out.printf("%d ", value);
                    set.remove(value);
                }
            }
            System.out.println();
        }
	}

}

/*
문제 2.
중첩 리스트를 작성하고 임의의 값을 입력 및 출력하는 코드를 작성하세요.
문제 3.
리스트의 중복되는 값을 Set을 이용해 중복처리 후 결과를 출력하세요. 
*/

