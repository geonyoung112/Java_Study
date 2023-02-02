package com.test.ch11;

public class Ex02_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setName("홍길동");
		e.setAge(27);
		e.setSalary(550);
		e.setGrade(Grade.FULL_TIME);
		e.print();
		
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setAge(62);
		e1.setSalary(550);
		e1.setGrade(Grade.EXECUTIVES);
		e1.print();


	}

}

interface Print{
	public abstract void print();
}

class Employee implements Print{
	private String name;
	private int salary;
	private Grade grade;
	private int age;
	
	public Grade getGrade() {
		return grade;
	}
	
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		float bonus = 0f;
		int total = 0;
		
		switch(grade) {
		case PART_TIME:
			bonus = 0.5f;
			break;
			
		case FULL_TIME: 
			bonus = 1.1f;
			break;
		case EXECUTIVES:
			bonus = 2.1f;
			break;
		default:
			bonus = 1.2f;
			break;
		}
		
		total = (int)(salary * bonus);
		
		return total;
	}
	
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	public void print() {
		System.out.println("- 직원정보 -");
		System.out.println("이름: " + getName());
		System.out.println("나이: " + getAge());
		System.out.println("직급: " + getGrade());
		System.out.println("보너스 + 월급: " +  getSalary());
		System.out.println();

	}
	
	
}

enum Grade {
	PART_TIME, FULL_TIME, EXECUTIVES
}