package day10.abstract_.good;

public class MainClass {

	public static void main(String[] args) {

		/*
		 * 1. 추상메서드를 사용하면 오버라이딩이 강제화 되어 프로그래머의 오버라이딩 실수를 줄일 수 있다.
		 * 2. 객체의 추상화 == 다형성의 사용.
		 * 	  => 추상클래스는 객체로 생성이 안되기 때문에, 자식으로 생성해서 부모타입으로 구체화하여 사용함.
		 */
//		Store s = new Store(); (X) 
		
		SeoulStore s1 = new SeoulStore();//자식으로 만들어서 추상클래스를 사용해야한다.
//		Store s1 = new SeoulStore(); //부모클래스로 객체생성을 해도 바뀌는 건 없다. 왜냐? 무조건 오버라이딩 되어 있으니 그게 먼저 발현되어서(다형성).상속이 내려오기 때문에.
		s1.apple();
		s1.melon();
		s1.grape();
		s1.orange();
		s1.newMenu();
		System.out.println(s1.getName());
		
		System.out.println("=======================");
		BusanStore s2 = new BusanStore();
		s2.apple();
		s2.grape();
		s2.orange();
		s2.melon();
		s2.newMenu();
		System.out.println(s2.getName());
		
	}

}
