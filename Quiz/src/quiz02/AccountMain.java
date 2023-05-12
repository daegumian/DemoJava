package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account park = new Account("박동훈", "1234", 0);
		
		System.out.println("예금주 : " + park.accountNumber);
		System.out.println("비밀번호 : " + park.password);
		System.out.println("잔고 : " + park.balance+"원");
		
		
		System.out.println();
		
		park.deposit(1000);
		park.deposit(-1000);
		park.withDraw(500);
		park.withDraw(500);
		park.withDraw(500);
		int balance = park.getBalance();
		park.getBalance();
		System.out.println("박동훈님의 현재 잔고는 : " + park.getBalance2() + "원 입니다.");
	}
}
