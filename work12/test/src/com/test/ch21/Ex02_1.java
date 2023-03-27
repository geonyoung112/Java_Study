package com.test.ch21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
				BufferedReader in = new BufferedReader(new FileReader("src/com/test/ch21/test3.txt"));
				BufferedWriter out = new BufferedWriter(new FileWriter("src/com/test/ch21/test3-bufferedwriter.txt"));
			) {
				String line;
				while ((line = in.readLine()) != null) {
					out.write(line);
					out.newLine();
				}
				System.out.println("< File Reader/Writer -> Buffered Reader/Writer >");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
/*
문제 1.
문장들이 적힌 텍스트 파일을 생성하세요.
버퍼를 사용해 텍스트 파일을 읽어 들인 후 줄 번호와 함께 내용들을 출력하세요.
예) 
1. 안녕하세요.
2. Hello.
*/
