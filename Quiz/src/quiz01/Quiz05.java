package quiz01;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		
		/*
		 * 1.하나의 정수를 입력받습니다
		 * 2.이 정수가 짝수인지, 홀수인지, 음수인지, 0인지 판별하
		 *   프로그램 코드 작성
		 */
		
		Scanner scan = new Scanner(System.in); // 순서를 잘 지켜야한다. 다시 복습하기
		System.out.println(">");
		int a = scan.nextInt();
		
		if(a == 0) {
			System.out.println(a+"은 0입니다.");
		} else if(a < 0) {
		System.out.println(a+"은 음수 입니다.");
		}
		
		else if(a % 2 == 0) {
			System.out.println(a+"은 짝수입니다.");
		}else{
			System.out.println(a+"은 홀수입니다.");
		}
		
		
		scan.close();
		
	}
}
