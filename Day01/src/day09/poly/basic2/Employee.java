package day09.poly.basic2;

public class Employee extends Person {
	
	String department;
	
	//상속 받아서 name,age 갖고 있음
	
	Employee(String name, int age, String department){//기본생성자
		super(name, age);
		this.department = department; // 자식 클래스에서 선언된 멤버변수
		
	}
	
	String info() {
		return super.info() + ", 학번 : " + department;
	}
	
}
