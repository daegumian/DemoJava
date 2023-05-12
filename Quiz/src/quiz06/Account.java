package quiz06;

public class Account {

	//한 사람의 은행계좌
	/*
	 * accountNumber변수 - 식별아이디
	 * password변수 - 비밀번호
	 * balance변수 - 잔고
	 * 
	 * 생성자
	 * 3가지를 모두 받아서 초기화하는 기능
	 * 
	 * 메서드
	 * deposit : void - 잔고에 매개변수를 누적하는 기능 count +=
	 * withDraw : void  - 잔고에서 매개변수를 차감하는 기능 count-=
	 * getBalance : int - 잔고를 return하는 기능.
	 * 
	 * 메인클래스에서는 각각의 기능을 확인.
	 * 
	 */

	String accountNumber;
	String password;
	int balance;
	
	Account(){ //기본 생성자를 만들면 상속시 엑박 에러를 잡을 수 있음.
		
	}

	Account(String a, String b, int c){

		accountNumber = a;
		password = b;
		balance = c;

	}

	void deposit(int k) {
		//매개변수가 양수 일때만 가능하도록 변경
		if(k>0) {
			balance += k;
			System.out.println("박동훈님의 계좌에 " + k + "원 입금되었습니다.");
		}else {
			System.out.println("박동훈님의 계좌에 입금될 돈이 없습니다.");
		}
	}
	void withDraw(int i) {
		//잔고가 0보다 클때만 출금이 가능하도록 변경
		if(balance > 0) {
			balance -= i;
			System.out.println("박동훈님의 계좌에 " + i + "원 출금되었습니다.");
		}else {
			System.out.println("박동훈님의 계좌에 출금될 돈이 없습니다.");
		}
	}
	int getBalance() {
		int sum = balance;
		System.out.println("박동훈님의 현재 잔고는 : " + balance +"원 입니다.");
		return sum;
	}
	int getBalance2() {
		return balance;
	}
}

