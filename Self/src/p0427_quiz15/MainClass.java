package p0427_quiz15;

public class MainClass {
	
	public static void main(String[] args) {
		
		Pdh p = new Pdh();
		
		p.insert("Tv");
		p.insert("Tv");
		p.insert("Tv");
		p.insert("Computer");
		p.insert("Computer");
		p.print();
		System.out.println(p.search("Computer"));;
		p.delete("Tv");
		p.delete("Computer");
		p.print();
		
		
	}

}
