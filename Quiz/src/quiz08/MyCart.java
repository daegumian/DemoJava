package quiz08;

import java.util.Arrays;

public class MyCart extends Cart {

	//1. 생성자는 money를 전달 받고 money값 초기화, tv = 300, com = 400, radio=500;

	//2. buy(), add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv", "com", "radio"
	 * 
	 * buy(상품명) 기능
	 * 매개변수가 tv, com, radio라면 -> 금액(money)에서 상품가격을 차감하고, add()메서드를 실행합니다.
	 * 단, 올바르지 않은 상품이거나, 금액이 부족할 경우에는, 적절한 처리를 하라.
	 * 
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart의 배열이 꽉 찼으면 2배의(배열크기*2?) 카트배열로 옮겨주세요. <-자식 클래스에서 오버라이드??
	 * 
	 * 마지막에는 info() 메서드를 호출합니다
	 * 
	 * info() 는
	 * cart배열에 담긴 물건 목록만(null 제외) 출력해주세요. <-Arrays.toString 못씀.
	 * 
	 */


	MyCart(int money){

		this.money = money; //부모 클래스의 멤버변수

	}

	void info() {
		System.out.println("❤❤🧡🧡❤❤info❤❤🧡🧡❤❤");
		System.out.println("현재 카트 목록 [" + cartinfo + "]");
		System.out.println("현재 잔액 : " + this.money);
		System.out.println("=========================");
		
	}


	String cartinfo = "";

	void add(String product) {
		if(product.equals("tv")) {
			String[] cart = new String[i+1];
			cart[i-1] = "tv";
			cartinfo += cart[i-1] + " ";
			System.out.println("카트에 tv가 담겼습니다.");
			info();
		}
		if(product.equals("com")) {
			String[] cart = new String[i+1];
			cart[i-1] = "com";
			cartinfo += cart[i-1] + " ";
			System.out.println("카트에 computer가 담겼습니다.");
			info();
		}
		if(product.equals("radio")) {
			String[] cart = new String[i+1];
			cart[i-1] = "radio";
			cartinfo += cart[i-1] + " ";
			System.out.println("카트에 radio가 담겼습니다.");
			info();
		}
	}



	void buy(String product) {
		if(product.equals("tv")) {
			this.tv = 300;
			i++;
			if(this.money > 0 && this.money >= tv) {
				this.money -= tv;
				System.out.println("=========================");
				System.out.println("tv를 구매했습니다.");
				add("tv");
			}else {
				System.out.println("=========================");
				System.out.println("잔액부족입니다.");
			}
		}

		if(product.equals("com")) {
			this.com = 400;
			i++;
			if(this.money > 0 && this.money >= com) {
				this.money -= com;
				System.out.println("=========================");
				System.out.println("com를 구매했습니다.");
				add("com");
			}else {
				System.out.println("=========================");
				System.out.println("잔액부족입니다.");
			}
		}
		if(product.equals("radio")) {
			this.radio = 500;
			i++;
			if(this.money > 0 && this.money >= radio) {
				this.money -= radio;
				System.out.println("=========================");
				System.out.println("radio를 구매했습니다.");
				add("radio");
			}else {
				System.out.println("=========================");
				System.out.println("잔액부족입니다.");
			}
		}
		

	}





}
