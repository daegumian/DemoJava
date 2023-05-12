package quiz17;

import java.util.Scanner;

public class Caclulator {

	public static int input() throws Exception {
		
		/*
		 * 1. 스캐너로 정수 2개를 입력 받아서 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환.
		 * 3. 예외가 발생하면, 직접예외를 생성하고 예외 메시지를 외부로 전달하면 됩니다.
		 * 4. scan.close()은 finally에서 처리하세요
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		try {
			System.out.println("실수하지 마세요.");
			System.out.print("첫번째 정수 : ");
			int num1 = scan.nextInt();
			System.out.print("두번째 정수 : ");
			int num2 = scan.nextInt();
			int sum = 0;
			
			sum = num1 + num2;
			
			System.out.println(sum);
			return sum;
		} catch (Exception e) {
			throw new Exception("정수가 아닙니다.ㅂ2");
		
		}finally {
			scan.close();
		}
		
		
	}
	
public static void main(String[] args) {
		
		Caclulator cal = new Caclulator();
		try {
			cal.input();
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
//			e.printStackTrace();
		}
	
	}
	
	
	
}
