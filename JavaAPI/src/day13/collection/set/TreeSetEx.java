package day13.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		
		//set + 정렬
		TreeSet<Integer> set = new TreeSet<>();
		
		//오름차순으로 저장됨. set과 다름!
		set.add(100);
		set.add(100);
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(34);
		
		System.out.println(set.toString()); //[5,34,10,20,100]
		
		for( int a  : set) {
			System.out.print(a+" ");//5,34,10,20,100
		}
	}
}
