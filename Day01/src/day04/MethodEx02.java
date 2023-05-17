package day04;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		
		/*
		 * 매개변수(=parameter)
		 * 메서드가 전달받는 매개값
		 * 여러개 받을 수도 있고, 받지 않을 수도 있다.
		 */
		
		
		int result = calSum(10); //매개변수가 있으면 매개변수를 똑같이 맞춰준다.
		System.out.println("결과 : " + result);

		int result2 = calSum(100); //매개변수가 있으면 매개변수를 똑같이 맞춰준다.
		System.out.println("결과 : " + result);
		
		Scanner scan = new Scanner(System.in);
		int k = scan.nextInt();
		int result3 = calSum(k);
		System.out.println("1~" + k + "까지의 합 : " + result3);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result4 = calSum2(a,b);
		System.out.println(a + " + " + b + "의 합은 : " + result4);
		
		
		String result5 = calSum3(5, "가");
		System.out.println("결과 : " + result5);
		
		scan.close();
	} //main end

	
	static int calSum(int a) { //반환값O, 매개변수O
		
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	static int calSum2(int a, int b) { //반환값O, 매개변수 2개 O

		
		return a+b; //타입만 맞으면 이것도 가능.
	}
	static String calSum3(int a, String s) { //매개변수는 자유롭게 가능.
		
		String str = "";		
		for(int i = 1; i <= a; i++) {
			str += s;
			
		}
		
		return str;
	}
	
	
	
}
