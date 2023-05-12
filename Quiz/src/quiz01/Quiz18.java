package quiz01;

import java.util.Arrays;

public class Quiz18 {

	public static void main(String[] args) {
		
		//배열 요소들 중 짝수인 값들의 합
		int[] arr = {54, 32, 3, 5, 7, 14, 20};
		int i = 0; //index의 순서 시작은 0!
		int sum = 0;
		while(i < arr.length) {
			if(arr[i] % 2 ==0) {
				sum += arr[i];
			}
			i++;
		}
		System.out.println("결과:"+sum);
	}
}
