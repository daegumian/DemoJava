package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		//배열 정렬 - 정렬은 대략 6개. 그림을 보면서 하면 좋다.
		//선택 정렬 
		int[] arr = {5, 23, 1, 43, 200, 100, 40};
		// 1 회전 = 1, 23, 5, 43, 200, 100, 40
		// 2 회전 = 1, 5, 23, 43, 200, 100, 40
		// 3 회전 = 1, 5, 23, 43, 200, 100, 40
		// 4 회전 = 1, 5, 23, 40, 200, 100, 40
		// 5 회전 = 1, 5, 23, 40, 43, 200, 100
		// 6 회전 = 1, 5, 23, 40, 43, 100, 200

		//바깥 반복문은 회전수
		//안쪽 반복문은 비교할값

		for (int i = 0; i < arr.length-1; i++) { //0~5까지 돌아도 됨.(효율성의 이유로 -1) 

			for (int j = i+1; j < arr.length; j++) { //비교할 값이니까 i+1. 그리고 끝까지 비교하니까.
				//				System.out.println(i+"-"+j); //헷갈릴 때는 잘 돌아가고 있는지 출력해 확인해 보기

				if(arr[i] > arr[j]) { //비교 대상이 작다면 swap

					int temp = arr[i]; //줄여서 쓰는 법.
					arr[i] = arr[j];
					arr[j] = temp;

				}


			}
			
		}		
		
		System.out.println(Arrays.toString(arr));
	}
}
