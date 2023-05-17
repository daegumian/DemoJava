package day05;

public class Variable {

	int a = 1; //멤버 변수//선언과 동시 초기화는 가능 // 클래스 안에서 생성 // 초기화 안해도 됨(자동 초기화 됨)
	String b;
	
	void printNum(int d) {
		
		int c = 1; // 지역변수 // 클래스 밖에서 바꿀 수 있음.
		
		System.out.println("멤버변수 : " + a);
		System.out.println("멤버변수 : " + b);
		System.out.println("지역변수 : " + c); //<--초기화가 안되면 사용 불가 //클래스 밖에서 못 바꿈.
		System.out.println("지역변수(매개변수) : " + d); // 클래스 밖에서 못 바꿈.
	
		

	
		
	}
	
	
}
