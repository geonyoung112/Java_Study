package com.test.ch21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (
			FileInputStream in = new FileInputStream("src/com/test/ch21/hello.txt");
			FileOutputStream out = new FileOutputStream("src/com/test/ch21/out1-fileoutputstream3.txt");
		) {
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
			System.out.println("< FileInputStream / FileOutputStream > (try-with-resources)");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

/*
문제 1.
임의의 내용이 입력된 hello.txt파일을 생성하세요.
hello.txt파일의 내용을 복사하는 코드를 작성하세요.
*/
