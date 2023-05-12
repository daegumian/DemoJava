package quiz01;

import java.util.Arrays;

public class Quiz21_1 {

	public static void main(String[] args) {

		/*
		 * 1. 1~9까지 숫자 중에서 절대 중복되지 않는 숫자를 추출
		 * arr를 랜덤하게 10번 섞어줍니다.
		 * 랜덤해서 섞은 후 앞에서 3개 추출
		 * 선생님 방법이 좀 더 배열을 활용하여 푼 풀이법이다.
		 */

		int[] arr = {1,2,3,4,5,6,7,8,9};

		for (int i = 0; i < arr.length; i++) {

			int a = (int)(Math.random()*9);
			int b = (int)(Math.random()*9);
		

			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;

		}
		int[] newArr = new int[3];
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		System.out.println(Arrays.toString(newArr));
		
	}

}
