package day08.super_2;

public class Student extends Person {

	String studentId;
	
	Student(String name, int age, String studentId){
		super(name, age); //바로 부모님의 생성자로 연결해줌.
//		this.name = name; //왼쪽은 name은 부모 클래스에서 선언된 멤버변수
//		this.age = age; //왼쪽은 age은 부모 클래스에서 선언된 멤버변수
		this.studentId = studentId; // 자식 클래스에서 선언된 멤버변수
		
	}
	
	
	String info() {
		return super.info() + ", 학번 : " + studentId;
	}
	
	
}
