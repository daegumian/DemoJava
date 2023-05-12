package day04;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		// 배열의 한계점 -> 크기가 고정이다.
		// Stack - Last In First Out (LIFO)

		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		
		pop();
		pop();
		int r = pop(); //삭제된 데이터도 확인이 가능
		System.out.println("삭제된 데이터 : " + r);
		System.out.println(Arrays.toString(arr));


	}

	static int[] arr = {1,2,3}; // 집나감. method out, class in. class가 더 큰 범위.

	//push -> 특정 요소를 마지막에 추가
	static void push(int data) { //push메서드의 모형
		//1. 배열의 크기를 +1 한 새로운 배열만듦
		int[] temp = new int[arr.length+1]; //그래야 기존 배열보다 +1 인 배열이 만들어짐. 아주 기본.

		//2. arr배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i]; //{1,2,3,0}

		}
		//3. 마지막에 추가
		temp[temp.length-1] = data; //항상 배열의 마지막은 length-1! 
		//temp {1,2,3,data};

		//4.원본 배열을 temp로 변경
		arr = temp;
		temp = null; //temp는 지움

	}


	//pop -> 특정 요소를 마지막에서 삭제 (반환 - 삭제된 데이터)
	static int pop() {

		if (arr.length > 0) { //그래야 삭제가능 0보다 작으면 삭제할 거리가 없잖아.?
			//1. 삭제할 데이터를 백업
			int del = arr[arr.length-1]; //한자리 줄어드는 현상이니.
			//2. arr보다 -1 인 사본배열을 생성
			int[] temp = new int[arr.length-1];
			//3. 원본배열을 사본으로 복사.(맨 마지막 데이터만 제외)
			for(int i = 0; i < temp.length; i++) { //복사본 길이만큼만 돌리면 됨. 삭제하고 그만큼만 쓸거니까.
				temp[i] = arr[i];
			}
			//4. 사본배열을 원본배열로 변경
			arr = temp;
			
			temp = null; //옮겼으니 temp 삭제.
			return del;//삭제된 데이터 반환 
		}


		return 0; //위에 return으로 인해 반환되어 여기 return은 실행x

	}

	
	

}
