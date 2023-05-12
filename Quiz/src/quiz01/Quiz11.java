package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 * 1. 정수를 입력받습니다.
		 * 2. 입력받은 수까지 약수의 합
		 * 
		 * 예시
		 * 입력수 10
		 * 약수의 합 18(1,2,5,10) 약수란 어떤 수를 나누어 떨어지게 하는 수.
		 */
		System.out.println("정수를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.print(num+"의 약수 : ");
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			
			if( num % i == 0) {
			  sum += i;
			  System.out.print(i);
			  System.out.print(" ");
			}
			i++;
			
		}
		System.out.println();
		System.out.println("약수의 합은 : "+ sum);
		scan.close();
		
		/////////////////
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
