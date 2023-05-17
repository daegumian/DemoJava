package day02;

import java.util.Scanner;

public class ContinueEx02 {

	public static void main(String[] args) {
		
		//continue의 활용????
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력:");
		int num = scan.nextInt();
		
		int count = 0;//합계변수(카운트변수)
		int sum = 0;
		
		x:for (int i = 1; i <= num; i++) {
			count = 0;
			
			for(int j =1; j <= i; j++) {
				//적절한 시점 초기화...
				if(i % j == 0) { // 소수 판별법 1단계.
					count++;
				}
				
				if(count > 2) //약수개수가 2개 초과라면 다음 수 확인.
					continue x;
				
				
				
			}// end for
			if(count == 2) { //소수 판별법 2-1단계. //소수를 sum에 누적
				sum += i;
				 //킬포
			}
		}
		System.out.println(sum);
		
		
		
		
		
	}
}
