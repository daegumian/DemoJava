package day01;

public class DataType {

	public static void main(String[] args) {
		
	
		//정수형 타입 범위
		byte a = 127;
		byte a1 = -128;
		
		short b = 32767;
		short b1 = -32768;
		
		int c = 2147483647;
		int c1 = -2147483648;
		
		long d = 123123123123123L;
		
		//2진수, 8진수, 16진수 -> 이렇게 쓸 수 있지만 그냥 10진수로 써라.
		int bin = 010; //8진수는 앞에 0을 붙임
		System.out.println("8진수 010은 :" + " " + bin+"이에용!");
		
		int bin2 = 0b111;
		System.out.println("2진수 ob111은:"+" "+bin2+"입니다용!");
		
		int hexa = 0xA9;
		System.out.println("16진수 0xA9는:"+" "+hexa+"입니다만!");
		
		System.out.println("-------------------------------------")	;
		
		//실수형 타입
		float f1 = 3.14F; //F 이거 플롯이여.
		double d1 = 3.14;
		System.out.println(f1);
		System.out.println(d1);
//		System.out.println(f1, d1); <-- 이런 출력방식에 자바에서는 없음
		
		float f2 = 3.141527F; //7자리까지 유효하고 그 뒤는 반올림함
		double d2 = 3.1415277777777; //15자리까지 유요하고 그 뒤는 반올림함
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("-------------------------------------")	;
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
	}
}
