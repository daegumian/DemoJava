package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다.
		 * 
		 * 정수 3개를 입력 받습니다.
		 * 
		 * 가장 큰값, 중간값, 작은값을 구분해서 출력
		 * (조건 - 같은 수는 없다 라고 가정)
		 * 
		 *  입력
		 *  15, 30, 7 -> max:30, mid:15, min:7
		 *  1,2,3 -> max:3,mid:2,min:1
		 *  
		 */
	
		int max = 0;
		int mid = 0;
		int min = 0;
		
		Scanner scan = new Scanner(System.in);
	
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
	
		if(a > b && a > c) {
			System.out.println("max:"+a);
		}else if(b>a && b>c) {
			System.out.println("max:"+b);
		}else {
			System.out.println("max:"+c);
		}
	
		if((a>b&a<c)|(a<b&a>c)) {
			System.out.println("mid:"+a);
		}else if((b>a & b<c)|(b<a & b>c)){
			System.out.println("mid:"+b);			
		}else {
			System.out.println("mid:"+c);
		}
		
		if(a<b & a<c) {
			System.out.println("min:"+a);
		}else if(b<a & b<c) {
			System.out.println("min:"+b);
		}else {
			System.out.println("min:"+c);
		}
		scan.close();
		
	}
}
