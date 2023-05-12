package day10.final_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		Person p1 = new Person("123123", "홍길동");
//		p1.nation = "프랑스"; 변경이 안됨.
  		System.out.println(p1.ssn);
		
		Person p2 = new Person("312312", "이순신");
		System.out.println(p2.ssn);
		
		System.out.println(Contant.DOMAIN);
		System.out.println(Math.PI);//pi는 상수다.
		
		
	}
	
	
}
