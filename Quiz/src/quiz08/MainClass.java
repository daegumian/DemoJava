package quiz08;

public class MainClass {

	public static void main(String[] args) {
		
		MyCart mc = new MyCart(1200);
		
		mc.buy("tv");
		mc.buy("com");
		mc.buy("radio");
		mc.add("tv");
		
	}
}
