package day12.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {
	
	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,6,7};
		
		//정렬
		Arrays.sort(arr);
		
		//
		System.out.println(Arrays.toString(arr));
		
		//탐색 - 선행조건 : 정렬되어 있어야함. (.sort();랑 셋트겠네?)
		int result = Arrays.binarySearch(arr, 4); //배열명, 찾을값 
		System.out.println(result); // 음수가 나오면 값은 없음
		int result2 = Arrays.binarySearch(arr, 5); 
		System.out.println(result2);//3 // 값에 대한 인덱스 위치 반환
		
		//완전한 형태의 배열복사
		int[] newArr = Arrays.copyOf(arr, arr.length);
		//복사할 배열, 새로운 배열의 길이
		System.out.println(Arrays.toString(newArr)); //깊은복사(완전히 새로운)
		System.out.println(arr == newArr);
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(newArr2));
		
		//배열 크기 지정 복사 //이상부터 미만까지!
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3);// *이상부터 미만까지!
		System.out.println(Arrays.toString(newArr3)); // 2,3
		
		//배열의 원소비교
		if(Arrays.equals(newArr2, newArr)) {
			System.out.println("배열의 원소가 정확히 일치함");
		}else {
			System.out.println("배열의 원소가 정확히 일치하지 않음"); //다름
		}
	}
}
