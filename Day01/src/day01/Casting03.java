package day01;

public class Casting03 {

	public static void main(String[] args) {
		
		char c = 'C';
		int i = 2;
		
		//1. 다른 타입 연산 자동 형변환
		char cc = (char) (c + i); //우선 순위 때문에 연산 순서 재조정.
		System.out.println(cc);
		int ii = c + i; //크기가 상식으로 맞기 때문에 형변환 X
		System.out.println(ii);
		
		//2. int형보다 작은 타입의 연산의 결과 = 무조건 int(정수가 기준)
		byte b1 = 100;
		byte b2 = 10;
//		byte b2 = b1 + b2; <-8비트 연산을 못하고 32비트로 바꿔서 연산을 해야함.
		byte b3 = (byte) (b1+b2);
		
		short s1 = 100;
		byte b = 10;
//		short s2 = s1 + b; //결과가 int
		short s2 = (short)(s1+b);
		
		System.out.println(b3);
		System.out.println(s2);
		
		
	}
}
