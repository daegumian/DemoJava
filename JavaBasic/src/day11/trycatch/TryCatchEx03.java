package day11.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//next, nextInt, nextDouble, nextLine
		
		//nextLine <-- 찾아보기!
//		
//		System.out.print("정수 : ");
//		int num = scan.nextInt(); // 12엔터 - 엔터기준 앞까지만 받음
//		scan.nextLine();
//		System.out.print("문자열 : ");
//		
//		String str = scan.nextLine(); //xxxx엔터 <- 엔터를 포함해서 받음
//		System.out.println(num);
//		System.out.println(str);
//		
		
		while(true) {
			
			try {
				System.out.println(">");
				int num = scan.nextInt(); //문자 엔터값을 정상적으로 처리를 못해서
				
				System.out.println(num);
				
			} catch (Exception e) {
				System.out.println("숫자로 입력해! 바부야!!");
				scan.nextLine(); //
			}
			
		}
		
		
		
		
		
	}
	
}
