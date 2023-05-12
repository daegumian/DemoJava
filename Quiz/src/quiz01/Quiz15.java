package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		/*
		 * 1. 입력받은 수까지의 소수들의 합
		 *  입력 7
		 *  -> 바깥반복문은 7까지 회전
		 *  1->1바퀴
		 *  2->2바퀴
		 */
		//소수는 약수의 개수 
		//각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
		//함정이 있다. 적절한 시점 초기화...을 해야된다.
		//소수 -> 카운트 : 초기화를 해야된다.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("정수입력:");
//		int num = scan.nextInt();
//		int count = 0;//합계변수(카운트변수)
//		int sum = 0;
//		for (int i = 1; i <= num; i++) {
//			for(int j =1; j <= i; j++) {
//				if(i % j == 0) { // 소수 판별법 1단계.
//					count++;
//				}
//			}// end for
//			if(count == 2) { //소수 판별법 2-1단계. //소수를 sum에 누적
//				sum += i;
//				count = 0; //킬포
//			}else if(count != 2){ //소수 판별번 2-2단계.
//				count = 0; //킬포
//			}
//		}
//		System.out.println(sum);
		
		//선생님 방법
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력:");
		int num = scan.nextInt();
		
		int count = 0;//합계변수(카운트변수)
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			count = 0;
			for(int j =1; j <= i; j++) {
				if(i % j == 0) { // 소수 판별법 1단계.
					count++;
				}
			}// end for
			if(count == 2) { //소수 판별법 2-1단계. //소수를 sum에 누적
				sum += i;
				 //킬포
			}
		}
		System.out.println(sum);
	}

}
