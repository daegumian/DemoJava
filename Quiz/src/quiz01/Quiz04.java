package quiz01;

import java.util.Scanner;

public class Quiz04 {
	
	public static void main(String[] args) {
		
		//1. 두 정 수를 입력 받고, 
		//단, 같은 수라면 "같은 수 입니다" 출력.
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b) {
			System.out.println(a);
			
		}else if(a<b) {
			System.out.println(b);
		}else {
			System.out.println("같은 수 입니다.");
		}
//		선생님 정답
//		System.out.println(">");
//		int A = scan.nextInt();
//		System.out.println("<");
//		int B = scan.nextInt();
//		
//		if (A>B) {
//			System.out.println(A+"가 큰 수 입니다.");
//		}else if(B>A) {
//			System.out.println(B+"가 큰 수 입니다.");
//		}else {
//			System.out.println("같은 수 입니다.");
//		}
//		
		scan.close();
	}

}
