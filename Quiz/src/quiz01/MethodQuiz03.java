package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		char[] a = {'a','b','c','d','e'};
		int[] b = {1,2,3,4,5,6,7,8,9,10};
		String[] c = {"가","나","다","라","마"};
		
		
		String result1 = method6(a);
		System.out.println(result1);
		
		int result2 = method7(b);
		System.out.println(result2);
		
		String[] result3 = method8("가", "나");
		System.out.println(Arrays.toString(result3));
	}
	
	static String method6(char[] a) {
		
		String str = "";
		for (int i = 0; i < a.length; i++) {
			
			str += a[i];
			
		}
		
		return str;
	}
	
	static int method7(int[] b) {
		
//		int sum = 0;
//		for(int i = 0; i < b.length; i++) {
//			sum += b[i];
//		}
//		
//		return sum;
		
		//향상된 for 문
		int sum = 0;
		for(int a : b) {
			sum += a;
		}
		return sum;
	}
	
	static String[] method8(String c, String d) {
//		String[] str = {c, d};
//		
//		return str;
		
		return new String[] {c, d};
		
	}
	
	
}



