package day01;

public class variable {
	
	public static void main(String[] args) {
	
		/**
		 *변수의 선언방법
		 *<데이터타입> 이름;
		 *
		 * int Integer의 약자로 정수를 저장하는 타입.
		 * 
		 */
		
		int num;
		num = 10;
//		num = 010; //앞에 0을 붙이면 8진수가 된다.
		System.out.println(num);
		
		//선언과 초기화를 동시에
		int num2 = 20; //보통 이렇게 많이 사용.
		
		//같은 이름으로 변수를 생성 X
//		int num2 = 30;
		
		//언제든지 값을 바꿀 수 있음
		num2 = 40;
		num2 = 50;
		
		//변수에는 다른 변수의 값, 또는 연산한 결과도 저장할 수 있다.
		int result = num + num2;
		result = num;
		
		//문자열을 저장 - String에 저장합니다.
		String myIdol = "아이유";
		
		int result2 = num + 20;
		result2 = 100;
		result2 = 10 + result2;
		//result2 ? = 110
		
		
	
		
		
		
		
		
		
		
		
}
}
