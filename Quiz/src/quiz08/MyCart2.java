package quiz08;

import java.util.Arrays;

public class MyCart2 extends Cart {

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
	//부모클래스의 멤버변수는 여기 어딘가에 있다.

	MyCart2(int money){

		this.money = money; //부모 클래스의 멤버변수 money = 매개변수 money
		int tv = 300;
		int com = 400;
		int radio = 500;
	}

	void buy(String product) {



		switch (product) { //return 키워드 활용을 하자. return은 종료다.
		case "tv":
			if(this.money < 300) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			}	else {
				this.money -= 300;
			}


			break;
		case "com" :
			if(this.money < 400) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			}else {
				this.money -= 400;
			}

			break;
		case "radio":
			if(this.money < 500) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			}else {
				this.money -= 500;
			}

			break;

		default:
			System.out.println("올바른 상품이 아닙니다.");
			return; //break를 없앤 이유는 함수종료를 해야해서.
		}

		add(product);


	}

	void add(String product) {
		
		if(i >= cart.length) { //기존 배열이 꽉찬경우.
			
			//2배인 배열 생성
			String[] newCart = new String[cart.length*2];
			for(int i = 0; i < cart.length; i++) {
				newCart[i] = cart[i]; //2배로 늘린 새로운 배열에 기존 카트 값 옮겨 닮기.
			}
			//기존 배열을 변경
			cart = newCart; //바꿔치리
			newCart = null; //삭제
			
		}
		cart[i] = product;
		i++;
		
	}
	
	void info() {
		
		String str = "[";
		for(int j = 0; j < i; j++) {
			str += cart[j] + " ";
		}
		str += "]";
		System.out.println(str);
		
	}







}
