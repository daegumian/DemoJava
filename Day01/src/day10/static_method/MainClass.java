package day10.static_method;

import java.util.Arrays;

public class MainClass {
	
	public static void main(String[] args) {
	
		Count c = new Count(); //Count클래스의 a를 사용하고 싶어서.
		c.method01();//일반
		c.method02();//static
		
		//static메서드의 사용
		Count.method02(); //실제 방법
		
		//main과 연관지어 생각, main은 static이라 static 필드와 메서드 쓸 수 있음!!
		
		//
		
//		Math.random(); //static이라 객체 생성없이 바로 사용할 수 있었음
//		Arrays.toString(new int[3]);//static이라 객체 생성없이 바로 사용할 수 있었음
//		Integer.parseInt("하이");//static이라 객체 생성없이 바로 사용할 수 있었음
//		String.valueOf(3);
		//등등.. 졸라 많타!
	
	
	}
	
	
	
	public void test() {
		
	}
	
	
	
}
