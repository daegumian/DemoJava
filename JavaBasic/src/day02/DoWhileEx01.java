package day02;

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		//do-while문은 조건이 false여도 무조건 1번은 실행함
		//2번째 부터는 while문과 완전히 동일하다.
		int i = 1;
		
		do {
			
			System.out.println(i);
			i++;
			
		} while (i<=10);
		System.out.println(i);
		
	}
}
