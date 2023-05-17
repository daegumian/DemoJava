package day09.poly.basic2;

public class Person extends Object { //모든 클래스는 Object클래스의 자식들이다.

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
//		System.out.println( this );
	}
	
	Person(String name){//		this.name = name;
//		this.age = 1;
//		System.out.println( this );
		this(name, 19); //생성자 연결!
	}
	
	Person(){
//		this.name = "";
//		this.age = 1;
//		System.out.println( this );
		this("이름없음", 20); //생성자 연결.
	}
	
	
	String info() {
		return "이름 : " + name + ", 나이 : " + age;
		
	}
	
}
