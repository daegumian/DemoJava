package day01;

public class Operator02 {

	public static void main(String[] args) {
		
		//2항 연산자
		int i = 7 / 3; //2
		int j = 7 % 3; //1
		int k = 7 * 3; //21
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	
		//비교 연산 <, <=, ==, >=, >, !=
		int x = 3;
	
		System.out.println(i == j);//X
		System.out.println(i>=j);//o
		System.out.println(i<j);//x
		System.out.println(i!=j);//o
		System.out.println(x % 2 == 0); // 짝수판별
		System.out.println(x % 2 != 0); // 홀수판별
	
		//비트 연산자 - 참고용
		int a = 5; // 0000 0101
		int b = 3; // 0000 0011
		
		System.out.println(a & b); //두 비트가 1이면 1, 아니면 0 = 0000 0001
		System.out.println(Integer.toBinaryString(b));
		
		
	}
	
}
