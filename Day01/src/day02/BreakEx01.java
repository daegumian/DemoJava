package day02;

public class BreakEx01 {

	public static void main(String[] args) {
		
//		for(int i = 1; i <= 10; i++) {		
//		 System.out.println(i);
//		 if(i==5) break; //중괄호가 없으면 한줄까지는 코드 작성 가능.
//		}

		/*
		 * 무한반복문
		 * - 반복문의 횟수를 정확히 모를 때 사용.
		 * - 자바에서는 while(true) 문장을 많이 사용.
		 * - 트정 조건에서 탈출하는 형식으로 사용.
		 */
		
		int i = 1;
		
		while(true) {
			
			System.out.println(i);
		
			if(i==15) {
				System.out.println("그만!");
				break;
			}
			
			i++;

		}
		
		
	}
}
