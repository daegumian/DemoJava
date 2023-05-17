package day05;

public class Phone {

	String model;
	String color;
	int price;
	
	//생성자를 직접 생성하게 되면, 기본 생성자 JVM이 생성자를 자동 생성하지 않는다
	//생성자는 반환 유형이 없음.
	//역할 : 멤버 변수를 초기화하는 용도로 보통 사용.
	Phone(){ //Phone의 생성자.
		System.out.println("생성자 호출! ㅋ");
		model = "Z플립4";
		color = "파랑색";
		price = 300000;
	}
	
	//생성자는 여러개 선언할 수 있다.
	//단, 매개변수의 종류 or 개수가 달라야 한다.
	//소괄호는 매개변수 받는 곳.
	Phone(String a){
		model = a;
		color = "아이보리";
		price = 200000;
	}
	
	Phone(String a, String b){ //모델, 색상
		model = a;
		color = b;
		price = 300000;
	}
	
	Phone(String a, int b){
		model = a;
		color = "하안색";
		price = b;
		
		
	}
	
	Phone(String a, String b, int c){
		
		model = a;
		color = b;
		price = c;
		
	}
	
	
	void info() { //메서드(반환 유형이 있음)
		System.out.println("=====폰의 정보====");
		System.out.println("모델 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("가격 : " + price);
		
	}
	
}
