package day10.final_.basic;

public class Child extends Parent {

	//final클래스 - 상속금지
	//final메서드 - 오버라이드금지
	
	//override O
	public void method01() {
		this.method02();
	}
	
	//override X
//	public void method02() {	
//		this.method01();
//	}

	
	
	
}
