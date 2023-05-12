package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자 중에서 절대 중복되지 않는 숫자를 추출
		 * arr를 랜덤하게 10번 섞어줍니다.
		 * 랜덤해서 섞은 후 앞에서 3개 추출
		 * 
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
		int temp1 = 0;
		int temp2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			int a = (int)(Math.random()*9);
//			System.out.println(a);
			
			temp1 = arr[a];
			arr[a] = temp2;
			temp2 = temp1;
			
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i]);
		}
	
	}
}
