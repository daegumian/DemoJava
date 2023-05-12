package quiz17;

public class MainClass {

	public static void main(String[] args) {
		
		Caclulator cal = new Caclulator();
		try {
			cal.input();
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
//			e.printStackTrace();
		}
	
	
	}
	
	
	
	
}
