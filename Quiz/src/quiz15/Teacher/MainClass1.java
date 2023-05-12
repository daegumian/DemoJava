package quiz15.Teacher;

import java.util.Arrays;

public class MainClass1 {
	
	public static void main(String[] args) {
		Park1 park1 = new Park1();
		
		park1.insert("Tv");
		park1.insert("Tv");
		park1.insert("Tv");
		park1.insert("Tv");
		park1.insert("Tv");
		park1.insert("Tv");
		park1.insert("Phone");
		park1.insert("Phone");
		park1.print();
//		System.out.println(Arrays.toString(park.arr));
		park1.search("Tv");
		System.out.println(park1.search("Tv"));
		System.out.println(park1.delete("Phone"));
		System.out.println(park1.delete("Tv"));
		park1.print();
		
	}
	
	

}
