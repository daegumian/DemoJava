package quiz12.teacher;

public class MainClass {

	public static void main(String[] args) {

		Radio r = new Radio(); //300, sony
		Tv t = new Tv(); //
		Computer c = new Computer(); //

		
		MyCart cart = new MyCart(2000);
		cart.buy(t);
		cart.buy(t);
		cart.buy(t);
		
		
		cart.info();

	}

}
