package day10.final_.basic;

public class Person {

	//final변수는 반드시 초기화를 합니다.
	//생성자를 통한 초기화 or 직접초기화
	//final을 제거해도 큰 문제 X
	
	public final String nation = "대한민국";
	public final String ssn;
	public String name;
	
	public Person(String ssn, String name) {
		
		this.ssn = ssn;
		this.name = name;
		
	}
	
	
}
