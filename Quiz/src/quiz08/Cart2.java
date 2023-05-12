package quiz08;

public class Cart2 {
	
	//String[] arr = new String[1]; 길이가 1인 배열
	String[] cart = new String[3]; //배열도 멤버변수로 선언 가능하다. //cart 클래스 안에 있는한 값이 유효하다.
	/*
	 * 메서드 안에 선언해 놓는 거와 차이가 있다.
	 * 
	 */
	
	int money; //금액  // 멤버변수 this.
	int i = 0; //cart의 순서
	
	int tv;
	int com;
	int radio;
	
	void buy(String product) {
		System.out.println("자식클래스에서 재정의 하세요");
	}
	
	void add(String product) {
		System.out.println("자식클래스에서 재정의 하세요");		
	}
	
	void info() {
		System.out.println("자식클래스에서 재정의 하세요");
	}
	
	
}
