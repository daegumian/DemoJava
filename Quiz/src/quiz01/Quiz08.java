package quiz01;

import java.util.Arrays;

public class Quiz08 {

	public static void main(String[] args) {
		
		String[] arr = {"안녕","Hello","니하오","오하~","!@#$"};
		
		/*
		 * 랜덤수를 생성, 랜덤수를 이용해서 배열의 랜덤한 값이 출력되게 처리.
		 * 출력된 문자열이, 어느 나라 언어인지 판별해서 출력.
		 * 
		 */
//	
//		
//		int result = (int)(Math.random()*10)+1;	
//		//배열을 이용한 것은?
//		
//		switch(result / 2) {
//		case 0: System.out.println("선택된 단어:안녕");
//				System.out.println("한국어입니다.");
//				break;
//		case 1: System.out.println("선택된 단어:Hello");
//				System.out.println("영어입니다.");
//				break;
//		case 2: System.out.println("선택된 단어:니하오");
//				System.out.println("중국어입니다.");	
//				break;
//		case 3: System.out.println("선택된 단어:오하~");
//				System.out.println("일본어입니다.");
//				break;
//		default:System.out.println("선택된 단어:!@#$");
//				System.out.println("외계어입니다.");
//			break;
//		}
//		
		//정답 원하는 바.
//		int index = (int)(Math.random()*5);
//		System.out.println("선택된 단어:" + arr[index]);
//		
		int index2 = (int)(Math.random()* arr.length);
		System.out.println("선택된 단어:" + arr[index2]);
		
		switch(arr[index2]) {
		case "안녕":
			System.out.println("한국어 입니다");
			break;
		case "Hello":
			System.out.println("영어 입니다");
			break;
		case "니하오":
			System.out.println("중국어 입니다");
			break;
		case "오하~":
			System.out.println("일본어 입니다");
			break;
		default : System.out.println("외계어입니다.");
		}
		
		
	
		
		}
	}
