package day11;

public class MainClass {

	public static void main(String[] args) {
		
		Basic b = new Basic();
		b.method01();//inter1꺼 오버라이드
		b.method02();//inter2꺼 오버라이드
		b.method03();//basic 내꺼
		
		System.out.println("--------------------------------");

		//인터페이스도 데이터타입이 될 수가 있다.
		//Inter1 처럼만 사용가능
		Inter1 i1 = new Basic();
		i1.method01(); //Inter1 기능만 사용가능
		
		System.out.println("--------------------------------");
		
		//Inter2 처럼만 사용가능
		Inter2 i2 = new Basic();
		i2.method02(); //Inter2 기능만 사용가능
		
		System.out.println("--------------------------------");

		//인터페이스에서도 클래스 캐스팅을 사용할 수 있다.
		Basic bb = (Basic)i2;
		bb.method01();
		bb.method02();
		bb.method03();
		
		//static 메서드의 사용
		Inter1.method3();
		
		//default 메서드의 사용 - 인터페이스에 미리 만들어진 몸체를 가지고 있는 메서드.
		bb.method4();//객체생성해야 사용가능.
		
		
		
		
		
		
		
		
	}
}
