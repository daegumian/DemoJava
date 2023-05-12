package day13.generic.good;

import day13.generic.bad.Person;

public class MainClass {
	public static void main(String[] args) {
		
		//ABC abc = new ABC(); 모든 값을 다 저장할 수 있긴하지만,,
//		ABC<타입> abc = new ABC<타입>; 형태
		ABC<String> abc = new ABC<String>();
		abc.setT("신노스케");
		String name = abc.getT();
		
		ABC<Person> abc2 = new ABC<>(); //생성자 꺽쇠는 생략가능
		abc2.setT( new Person());
		Person p = abc2.getT();
		
		ABC<Object> abc3 = new ABC<>();
		
		//제네릭타입은 원시타입 x
		//Integer로 사용해야함.
		//ABC<int> abc4 = new ABC<>(); X
		ABC<Integer> abc4 = new ABC<>();
		
		//제네릭 : 형 안정성! 다양한 데이터타입을 편리하게 사용하기 위한 
	
		///////////////////////////////////////////////////
		DEF<Integer, String> def = new DEF<>(); //멀티 제네릭
	}
}
