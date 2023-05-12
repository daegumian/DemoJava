package day09.poly.basic2;

public class Teacher extends Person {

	String subject;
	
	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject; // 자식 클래스에서 선언된 멤버변수
		
	}
	
	String info() {
		
		return super.info() + ", 과목 : " + subject;
	}
	
}
