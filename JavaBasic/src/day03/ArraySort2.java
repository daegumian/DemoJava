package day03;

import java.util.Arrays;

public class ArraySort2 {

	public static void main(String[] args) {

		//버블 정렬 - 가장 느림 (큰 값을 뒤로 보낸다.)
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		//붙어 있는 두개를 비교.
		//5, 1, 23, 43, 100, 40, 200 // 1회전 // 큰수를 젤 뒤로 보냄
		//1, 5, 23, 43, 40, 100, 200 // 2회전 // 그 다음 큰 수를 젤 뒤 앞으로 보냄
		//1, 5, 23, 40, 43, 100, 200 // 3회전 // 그 다음 큰 수를 젤 뒤 앞에 앞으로 보냄 -정렬완성
		//1, 5, 23, 40, 43, 100, 200 // 4회전
		//...계속 돔.

		//바깥 반복문은 회전수
		//안쪽 반복문이 비교횟수
		//6-6

//		for(int i = 0; i < arr.length-1; i++) {
//
//			for(int j = 0; j < arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {//옆에 있는 수끼리 비교하는 명령문
//
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//
//		}
//		System.out.print(Arrays.toString(arr));
		
	//아주 유용한 기능
		Arrays.sort(arr); // 가장 빠른 퀵정렬
		
		System.out.println(Arrays.toString(arr));
	
	
	}
}
		
		
		
		
		
		
		
		
