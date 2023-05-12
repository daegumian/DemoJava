package day07.this_;

public class Person extends Object {

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		System.out.println( this );
	}
	
	Person(String name){
//		this.name = name;
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
