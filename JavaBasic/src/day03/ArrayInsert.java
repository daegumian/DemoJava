package day03;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int[] newArr = new int[arr.length+1]; //추가할 거니깐 새로운 배열에 공간을 하나 더 만들어줌.


		int data = 100; //중간에 추가할 값 //중요한 포인트
		int targetIndex = 2; //추가 할 위치 //중요한 포인트

		//작업//1. newArr의 기존배열의 값을 옮김 
		for(int i=0; i<arr.length; i++) {
			newArr[i]=arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));//{10,20,30,40,50,0}
		System.out.println();
		
		//작업//2. 배열의 추가할 인덱스 ~ 마지막-1 까지 옮겨 담는 작업
		//뒤에서(마지막 것 전)부터, -> 마지막 것부터 해봤자 값이 0이라 필요가 없다.arr의 길이만큼.
		//바꿀 곳 전까지 잡아먹어 들어간다. ->그래야 넣을 공간이 생김!

		for(int i=newArr.length-1; i > targetIndex; i--) { //targetIndex 초과 까지!!
			newArr[i] = newArr[i-1];//앞에 걸 뒤에 저장.
		}
		//인덱스번째에 데이터 추가
		newArr[targetIndex] = data; //빈 공간! 타겟!
		
		//arr를 newArr로 변경
		arr = newArr;
		newArr = null; //완전한 삭제!
		
		System.out.println(Arrays.toString(arr)); //{10,20,100,30,40,60}
		System.out.println(Arrays.toString(newArr)); //null
	}
}
