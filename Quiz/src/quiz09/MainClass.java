package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ssa = new SuperSonicAp("park");
		ssa.takeOff();
		ssa.fly();
		ssa.flyMode = 1;
		ssa.fly();
	
		ssa.info();
		ssa.flyMode = 0;
		
		ssa.fly();
		ssa.land();
		
	}
	
	
	
	
}
