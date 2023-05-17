package day03;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch2 {

	public static void main(String[] args) {

		//이진탐색 - 반을 분할해서 찾아가는 방법(ex.updown게임 빨리 깨는법)
		//조건 - 반드시 순서대로 정렬이 되어 있어야 함.(구글링해서 찾아보셈)
		/*
		 *  1. 포인터(start, end)를 처음과 끝에 2개를 배치
		 *  2. 중간값을 구함
		 *  3. 중간값이 찾는 값인지 확인
		 *  4. 중간값이 찾는 값보다 크다면, end를 중간값-1로 내림
		 *  5. 중간값이 찾는 값보다 작다면, start를 중간값+1로 올림
		 *  6. 찾는 값이 없으면 Start와 end가 교차되는 값이 생김.
		 */
		int[] arr = {1,3,5,10,20,30,50,80,100};
		Scanner scan = new Scanner(System.in);
		System.out.println("찾을값:");
		int find = scan.nextInt();
		int start = 0;
		int end = arr.length-1; //8 (길이는 9, 인덱스는 길이-1)
		int count = 0; //회전수 확인.
		while(start <= end) { //start는 계속 커지고, end는 계속 작아졌다가 크로스되는 지점이 생기면 회전X
			count ++;
			//중간값
			int mid = (start + end) /2;
			if(arr[mid]==find) { 
				System.out.println("회전수는:"+count);
				System.out.print("찾을 값은:" + mid + "번째에 존재함");
				break;
			}//else 넣으면 반복문이 돌 때 못찾으면 출력되니깐 X
			//찾을 값이 중간 값보다 큰경우
			if(arr[mid]<find){
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		if(start>end) {
			System.out.println("찾는 값이 없습니다.");//다 돌고 확인 해야한다.
		}
		
		//이진 탐색 - 찾은 위치를 알려줌 /찾는 값이 없으면 음수를 알려줌.
		System.out.println();
		System.out.println(Arrays.binarySearch(arr, 4));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
