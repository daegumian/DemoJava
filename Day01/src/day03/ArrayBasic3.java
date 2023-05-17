package day03;

import java.util.Arrays;

public class ArrayBasic3 {

	public static void main(String[] args) {
		
		//배열은 크기가 고정
		//크기가 100인 배열에 1~100까지 수를 저장.
		int[] arr = new int[100];//배열의 크기 설정.
		
		for(int i = 0; i < arr.length; i++) { //for문이랑 while은 매한가지, for이 가독성 굿
			arr[i] = i+1; //i가 0부터 시작해야하는 이유는 배열의 인덱스가 0으로 시작해서 이고, 
						  //i+1을 한 이유는 인덱스 크기만큼 돌아가는 동안에, 숫자는 1부터 넣어야 하기 때문. 	
		}
		
		/////////////////////////////
		//배열 요소들의 문자열 합
		String str = "";
		for(int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
			str += arr[i] + " "; //String도 누적 가능!
		}
		System.out.println(str); //한번의 출력
//		System.out.println(Arrays.toString(arr)); //<- 문제들 답으로 제출 안됨?
		
	}
}
