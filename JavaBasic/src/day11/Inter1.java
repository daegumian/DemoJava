package day11;

public interface Inter1 {

	//public static final이 붙어 자동 상수 취급이 된다
	int A = 10; 
	
	//메서를 선언하면 자동으로 추상메서드가 된다.
	void method01();
	
	//인터페이스에는 static, default메서드 선언이 가능함
	public static void method3() {
		System.out.println("스텍틱 메서드");
	}

	public default void method4() { //디폴트 메서드는 멀까? 뒤늦게 추가된 문법쓰, 인터페이스를 수정할 때 쓰임.
		System.out.println("디폴트 메서드");
	}
	
}
