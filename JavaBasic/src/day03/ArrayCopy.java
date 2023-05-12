package day03;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열의 복사 - 길이가 고정
		
		//복사의 개념 2개 - 얕은 복사, 깊은 복사 개념만 알아두기
		//얕은 복사 - 주소값의 복사-> 주소값을 공유한다.(원본 배열도 가이 바뀜.)
		
		int[] arr = {1, 2, 3, 4, 5};//arr은 주소값.
		int[] newArr = arr;
		
		newArr[0] = 100; ////얕은 복사 주의 할점. 원본의 값(주소값)도 바뀐다.
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(newArr));
		
		//깊은 복사 - 완전히 새로운 배열을 만들고, 요소를 담는다. 수동적인 방법
		int[] arr2 = new int [5];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
			
		}
		//값을 변경하더라도 원본배열에는 영향 X
		System.out.println();
		arr2[0] = 200;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
	}
}
