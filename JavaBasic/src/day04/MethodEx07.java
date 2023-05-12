package day04;

public class MethodEx07 {

	public static void main(String[] args) {

		//메서드의 연쇄호출

		//		test01();

		//메서드의 재귀 : 중단할 수 있는 조건이 들어있으면 사용.
		recursive(1);
		System.out.println(fac(5));
		
	}

	static void test01() { //같은 클래스 안에서 생성된 메서드는 서로 호출 가능.
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}

	static void test02() {
		System.out.println("2번 메서드 실행");
		System.out.println("2번 메서드 종료");
	}

	static void recursive(int a) { //무한루프 메서드
		//함수의 재귀는 반드시 탈출의 조건이 있어야 한다.
		if(a==10) {
			return; //함수의 종료
		}
		System.out.println(a + "호출");

		a++;

		recursive(a);
	}
	
	static int fac(int a) {
		
		if(a == 1) return 1;
		
		
		return a*fac(a-1);
		
	}
	
	
	
	
	
	
	
	
	
}
