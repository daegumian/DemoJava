package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		/* => 문제출처 : 
		 * 1. 가로, 세로 길이를 입력을 받습니다.
		 * 2. 가로, 세로 길이만큼 사각형을 출력합니다.
		 * 3. 단, 윤곽만 나오면 됩니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가로:");
		int a = scan.nextInt();
		System.out.println("세로:");
		int b = scan.nextInt();
		
		
		for(int i = 1; i <= a; i++) {
			System.out.print("*"); //*****
		}
		System.out.println();
		for(int i = 1; i <=b-2; i++) {
			System.out.print("*");
			if(i <=a-2) {
				for(int j = 1; j <= a-2; j++) {
					System.out.print(" ");
				}
			System.out.println("*");
			}
			
		}
		
		for(int i = 1; i <= a; i++) {
			System.out.print("*"); //*****
		}
		System.out.println();
		System.out.println("-----------------");
		
		//마산식 방법
		int w = scan.nextInt(); //세로 5
		int q = scan.nextInt(); //가로 4
		
		for(int i = 1; i <=q; i++) { //세로만큼 반복
			if(i==1 || i==q) { //첫 번째 or 세로의 숫자만큼.
				for(int j=1; j<=w;j++) {
					System.out.print("*");
				}
			}else {
				for(int j=1; j<=w; j++) {//가로만큼 반복
					if(j==1||j==w) { //첫번째 or 가로의 숫자만큼
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
		
		
		scan.close();
		

	}
	
	
}
