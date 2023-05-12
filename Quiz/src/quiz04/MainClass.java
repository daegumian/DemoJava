package quiz04;

public class MainClass {
	
	public static void main(String[] args) {
		
		Warrior warrior = new Warrior("박동훈");
		warrior.info();
		warrior.bash();

		System.out.println();
		Wizard wizard = new Wizard("신지은");
		wizard.info();
		wizard.iceArrow();
		
	
	
	}

}
