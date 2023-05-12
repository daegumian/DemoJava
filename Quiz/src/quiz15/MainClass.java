package quiz15;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
		Park park = new Park();
		
		park.insert("Tv");
		park.insert("Tv");
		park.insert("Tv");
		park.insert("Tv");
		park.insert("Tv");
		park.insert("Tv");
		park.insert("Phone");
		park.insert("Phone");
		park.print();
//		System.out.println(Arrays.toString(park.arr));
		System.out.println(park.search("Tv"));
		System.out.println(park.delete("Phone"));
		System.out.println(park.delete("Tv"));
		park.print();
		
	}
	
	

}
