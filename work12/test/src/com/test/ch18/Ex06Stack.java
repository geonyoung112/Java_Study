package com.test.ch18;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Ex06Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("자바 컬렉션");
		book.addPage(new Page(0, "표지"));
		book.addPage((new Page(1, "목차")));
		book.addPage(new Page(2, "ArrayList"));
		book.addPage(new Page(3, "LinkedList"));
		book.addPage(new Page(4, "Queue"));
		book.addPage(new Page(5, "Statck"));
		
		book.nextPage();
		book.view();
		book.nextPage();
		book.view();
		book.nextPage();
		book.view();

		System.out.println();
		
		book.prePage();
		book.view();
		book.prePage();
		book.view();
		book.prePage();
		book.view();
		
		
		System.out.println("\n- 문제 풀이 결과 -");
		book.setPage(4);
		book.nextButton();
		book.prevButton();
		

	}

}

class Book {
	private String title;
	private Stack<Page> pageStack;
	private List<Page> pageList;
	private int currentPageNo;
	
	public Book(String title) {
		this.title = title;
		this.pageStack = new Stack<>();
		this.pageList = new LinkedList<>();
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<Page> getPageList() {
		return pageList;
	}
	public void setPageList(List<Page> pageList) {
		this.pageList = pageList;
	}
	public void addPage(Page page) {
		pageList.add(page);
	}
	public void nextPage() {
		pageStack.push(pageList.get(currentPageNo++));
	}
	public void prePage() {
		Page page = pageStack.pop();
		currentPageNo = page.getNo();
	}
	public void view() {
		System.out.println(pageList.get(currentPageNo));
	}
	
	public void setCurrentPageNo(int currentPageNo) {
		this.currentPageNo = currentPageNo;
	}
	
	
	// 문제1. 입력된 페이지로 설정되는 메소드
	public void setPage(int pageNo) {
	    pageStack.push(pageList.get(currentPageNo));
	    currentPageNo = pageNo;
	}
	// 다음 페이지로 이동
	public void nextButton() {
		System.out.println("다음 페이지로 이동하겠습니다.");
		pageStack.push(pageList.get(currentPageNo++));
	    view();
	}
	// 이전 페이지로 이동
	public void prevButton() {
		System.out.println("이전 페이지로 이동하겠습니다.");
		Page page = pageStack.pop();
		currentPageNo = page.getNo();
	    view();
	}

}

class Page {
	private int no;
	private String contents;
	
	public Page(int no, String contents) {
		this.no = no;
		this.contents = contents;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	@Override
	public String toString() {
		return no + "페이지 - " + contents;
	}
}


/*
문제 1.
입력한 페이지로 설정되는 메소드를 추가하세요.
view메소드를 이용해 설정된 페이지를 출력하세요.
페이지 설정 후 이전페이지와 다음페이지를 출력하세요.
*/
