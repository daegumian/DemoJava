package quiz06;

public class MainClass {
	
	public static void main(String[] args) {
		
		MyAccount mya = new MyAccount("1234", "1234", 3000);
		
		mya.deposit(1000);
		mya.withDraw(5000);
		mya.deposit(1000);
		mya.withDraw(5000);
	}
}
