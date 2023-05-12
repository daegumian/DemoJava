package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone blue = new Phone();
		blue.info();
		System.out.println();
		
		Phone ivory = new Phone("iPhone");
		ivory.info();
		System.out.println();
		
		Phone pink = new Phone("ZFlip5", "Pink");
		pink.info();
		System.out.println();
		
		Phone white = new Phone("Anycall", 400000);
		white.info();
		System.out.println();
		
		//model,color,price를 매개변수로 받아서 초기화 하는 생성자 만들기
		//객체생성도 해보삼.
		Phone MyPhone = new Phone("ZFlip4", "blue", 300000);
		MyPhone.info();
		
	}
	
}
