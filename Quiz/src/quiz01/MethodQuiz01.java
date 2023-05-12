package quiz01;

import java.util.Arrays;
import java.util.Iterator;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		String r1 = method2("가"); //이런식으로 타입 받기.
		System.out.println(method2(r1)); //이런식으로 타입 받기.
		System.out.println(method3(1,2,3));
		System.out.println(method4(5));
		method5("가", 3);
		System.out.println(maxNum(2,7));
		System.out.println(abs(-5));
		String str = java(9);
		System.out.println(str);
		
	}//main end.
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String a) {
	
		return a;
	}
	
	static double method3(int a, int b, double c) {
		double sum = 0;
		sum = a+b+c;
		return sum;
	}
	
	static String method4(int a) {
		
//		String str = "";
//		if(a % 2 ==0) {
//			str = "짝수";
//		}else {
//			str = "홀수";
//		}
		return a % 2 == 0 ? "짝수" : "홀수"; //선생님 방법
	}
	
	static void method5(String a, int b) {
		String str = "";
		for(int i = 1; i <= b; i++) {
			str += a;
		}
		System.out.println(str);
	}

	static int maxNum(int a, int b) {
		int max = 0;
		if(a<b) {
			max = b;
		}else{
			max = a;
		}
		return max;
	}
	
	static int abs(int b) {
		int k = 0;
		if(b<0) {
			k = -b;
		}else {
			k = b;
		}
		return k;
	}
	
	static String java(int a) { 
		String str = "";
		
		for(int i = 1; i <= a; i++) {
			if(i % 2 != 0) {
				str += "자";
			}else {
				str += "바";
			}
		}
		return str;
	}
	
	static String method6(char[] a) {
		String str = "";
		
		for (int i = 0; i < a.length; i++) {
			
			
		}
		return str;
	}
	
	
	
	
	
}


