package day03;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//삭제의 개념 - 배열은 삭제가 없습니다. 회전은 length-1번째까지 회전
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int[] newArr = new int[arr.length-1]; //삭제한 후 복사할 새로운 배열. 그릇 준비.
				
		int index = 5; //삭제할 위치는[5] : 고로, 6을 없앰.
		
		for(int i = index; i<arr.length-1; i++) { //삭제할 위치부터 시작.
			arr[i] = arr[i+1]; //뒤에 걸 앞으로 저장
		
		}
		System.out.println(Arrays.toString(arr));//{1,2,3,4,5,7,,8,9,10,10}
		System.out.println(Arrays.toString(newArr));//{0,0,0,0,0,0,0,0,0,0}
	
		//새로운 배열에, 기존배열을 옮겨 담는 작업
		for(int i = 0; i<newArr.length; i++) { //생성된 배열 만큼만 들어가면 되어서
			newArr[i] = arr[i];
		}
		
		//arr를 newArr로 변경
		arr = newArr; //얕은 복사가 아님.
		newArr = null; //완전한 삭제.
		
		
		System.out.println(Arrays.toString(arr)); //{1,2,3,4,5,7,8,9,10}
		//요소들이 앞으로 당겨지고 마지막은 그냥 내버려둠.
		System.out.println(Arrays.toString(newArr));//null
	}
}
