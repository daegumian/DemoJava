package quiz06;

import java.util.Scanner;

/*
철수는 Account를 상속받는 나의계좌를 만드려고 한다.
기존에 가지고 있는 withDraw()기능이 마음에 들지 않았다.

Account를 상속받고
withDraw()를 오버라이딩하여 사용자의 입력(Scanner)를 통해 비밀번호가 일치하면
금액을 감소시키려고 한다.
또한 balance보다 큰 금액을 출금하려는 경우에는 "잔액부족" 을 출력해주어야한다.
withDraw() 메서드를 오버라이딩 해주세요.

 */
public class MyAccount extends Account {

	Scanner scan = new Scanner(System.in);

	MyAccount(String a, String b, int c){

		accountNumber = a;
		password = b;
		balance = c;
	}
	void withDraw(int b) {
		//잔고가 0보다 클때만 출금이 가능하도록 변경
		System.out.print("비밀번호를 입력해주세요:");
		String a = scan.next(); 
		if(password.equals(a)) {
			if(balance > 0&& balance >= b) {
				balance -= b;
				System.out.println("박동훈님의 계좌에 " + b + "원 출금되었습니다.");
			}
			else {
				System.out.println("잔액부족입니다.");
			}
		}
	}
}
