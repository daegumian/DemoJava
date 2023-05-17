package day03;

import java.util.Arrays;

public class ArrayBasic1 {
	
	public static void main(String[] args) {
		//배열 선언
		
		int arr[];
		
		//배열의 생성
		arr = new int[5];// 배열의 공간을 생성. 5칸.
		
		//배열의 초기화 //그 공간에 데이터 값을 넣음. 이 방법은 노가다.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		//배열의 모형을 문자열로 출력하는 명령문 : Arrays.toString(); <-많이 나옴 외워두기.
		System.out.println(arr); //이상한 값 배열의 주소값이 나옴(배열의 생성위치)
		System.out.println(Arrays.toString(arr));
		
		//배열의 값을 변형
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));
		
		//배열의 길이를 보는 명령문
		System.out.println(arr.length);

		//배열의 선언하는 다양한 방법
		//1st
		int[] arr2 = new int[3]; //많이 사용 //배열 공간을 만듦
		
		//2nd //복잡해 보임,좋아하지 않음
		int[] arr3 = new int[] {1,2,3}; //많이 사용 X, 직접 초기값을 넣는 방법
		
		//3nd
		int[] arr4 = {1,2,3}; //많이 사용 //데이터를 바로 집어넣는 방법.
		
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));

		//배열은 초기값을 지정하지 않으면 기본값으로 자동 초기화
		//int는 0, double은 = 0.0, String = null
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
		
	}

}
