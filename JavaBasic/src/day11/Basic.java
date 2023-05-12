package day11;

public class Basic /*extends object*/ implements Inter1, Inter2{

	//인터페이스를 상속받을 때는 implements 키워드를 쓴다.
	//인터페이스에 있는 추상메서드는 반드시 오버라이딩 되야한다. 추상메서드랑 성격이랑 비슷!
	//인터페이스는 다중상속이 된다. 첫번째 문법!
	@Override
	public void method01() {
		System.out.println("재정의된 Inter1의 1번 메서드 사용");
	}

	@Override
	public void method02() {
		System.out.println("재정의된 Inter2의 2번 메서드 사용");
	}
	
	public void method03() {
		System.out.println("Basic의 3번 메서드 사용.");
	}
	
	
}
