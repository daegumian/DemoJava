package day07.overload;

public class Basic {

	/*
	 * 
	 * 오버로딩 - 같은 이름의 메서드를 여러개 생성하는 것.
	 * 
	 * 
	 */
	void input(int a) { //기본 메서드
		System.out.println("정수 1개 입력받음.");
	}
//	int input(int x) { //반환타입은 영향을 주지 않아, 불가능.
//		return 0;
//	}
	void input(String a) { //매개변수 타입이 달라서 오버로딩 가능
		System.out.println("문자열 1개 입력받음.");
	}
	
	void input(int a, double b) { //매개변수 갯수가 달라 오버로딩 가능
		
	}
	
	void input(double b, int a) { //순서 바껴서 오버로딩 가능
		System.out.println("실수 1개, 정수 1개 입력 받음.");
	}
	
	void input(int a, char b, double c) { //매개변수 3개여도 가능.
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음.");
	}
}
