package day07_override01;

public class Child extends Parent {
	/*
	 * 오버라이딩 규칭
	 * 1. 상속관계를 지녀야함
	 * 2. 부모님 메서드의 모형이 같아야한다.
	 * 
	 * 
	 */
	
	//ex) method01은 여기 어딘가에 숨어있다.
	
	void method02() {
		System.out.println("자식의 오버라이 된 2번 메서드");
	}
	
}
