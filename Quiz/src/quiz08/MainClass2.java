package quiz08;

public class MainClass2 {

	public static void main(String[] args) {
		
		MyCart2 mc = new MyCart2(1200);
		
		mc.buy("tv");
		mc.buy("com");
		mc.buy("radio01");
		mc.add("tv");
		mc.info();
	}
}
