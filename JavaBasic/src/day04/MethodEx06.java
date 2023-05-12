package day04;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {

		for(int i = 1; i<=5; i++) {
			push(i);
			System.out.println(Arrays.toString(arr));
		}
		for(int i = 1; i<=5; i++) {
			pop2();
			System.out.println(Arrays.toString(arr));
		}

	
		




	}

	static int[] arr = {};

	//push

	static void push(int data) {

		int[] temp = new int[arr.length+1];

		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		for(int i = 0; i < temp.length; i++) {
			temp[temp.length-1] = data; 

		}

		arr = temp;
		temp = null;

	}

	static int pop() { // Queue 방법 First In First Out.

		if(arr.length > 0) { //삭제할 거리가 있어야한다.

			int del = arr[arr.length-1];

			int[] temp = new int[arr.length-1];

			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1]; //두번째거부터 저장하면 되지 않는가? 굿

			}
			arr = temp;
			temp = null;
			return del;
		}
		return 0;
	}

	static int pop2() {

		if(arr.length >0) {

			//1. 삭제할 데이터 백업
			int del = arr[0];
			//2. arr. - 1인 사본배열 생성
			int[] temp = new int[arr.length-1];
			//3. 배열의 1번째 요소~마지막까지 옮겨 담는다.
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1];
			}
			arr = temp;
			temp = null;
			return  del;


		}





		return 0;

	}


}
