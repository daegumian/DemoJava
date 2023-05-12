package quiz09;

public class MainClass2 {

	public static void main(String[] args) {
		
		SuperSonicAp2 ap = new SuperSonicAp2("park");
		
		ap.takeOff();
		ap.fly(); // override
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		
		
		
	}
	
	
	
	
}
