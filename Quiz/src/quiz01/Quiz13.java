package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
	
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력.
		
		System.out.print("7~100까지 정수 중에 7의 배수 :");
		for(int i = 7; i <=100; i++) {
			if(i%7==0) {
				System.out.print(" "+i);
			}
		}
//		//선생님 답.
//		for(int i =7; i<=100; i+=7) { 7부터 시작하고, i+=7은 7씩 더해지니까. 7의 배수
//			System.out.println(i+" ");
//		}
//		
		
		//2. 1~200까지 정수 중에 9의 배수의 개수를 출력.
		System.out.println();
		System.out.print("1~200까지 정수 중에 9의 배수의 개수는 : ");
		int count = 0;
		for(int i =1; i<=200; i++) {
			if(i%9==0) {
				count ++;
			}
		}System.out.println(count+"개");
		
		//3. 100~50사이의 두 수 사이의 합.
		System.out.print("100~50사이의 두 수 사이의 합 : ");
		int sum = 0;
		for(int i=50; i<=100; i++) {
			sum += i;
		}System.out.println(sum);
		
		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
		
		System.out.print("A~Z까지 : ");
		for(int i = 65; i<=90; i++) {
			char a = (char)i;
			System.out.print(a);
		}
		
		//선생님 정답. int 말고 char 값으로 해도댐
//		String str = "";
//		for(char c = 'A'; c <= 'z'; c++) {
//			System.out.println(c);
//		}
//					
		//5. 입력받은 정수까지 팩토리얼 5팩토리얼 = 5*4*3*2*1.
		System.out.println();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int fatorial = 1;
		for(int i = 1; i<=a; i++) {
			fatorial *= i; // 누적 연산!!!!!!!!!!!!!!
		}
		System.out.print(a+"!은"+fatorial);
	}
	
}
