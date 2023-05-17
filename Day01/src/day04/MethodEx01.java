package day04;

public class MethodEx01 {
	//메서드 안에서는 메서드를 못 만든다. <클래스 안 메서드 밖>,{중괄호 범위 신경 잘 쓰기.}

	public static void main(String[] args) { //main 메서드


		/*
		 * 메서드는 생성과 호출이 있습니다.
		 * 메서드는 메서드안에서 생성 할 수 없습니다.
		 */

		System.out.println("1~10까지합 : " + calSum());
		System.out.println("1~10까지합 : " + calSum());
		System.out.println("1~10까지합 : " + calSum());

		int result = calSum(); // 반환타입을 맞춰줘야함.
		System.out.println("1~10까지합 : " + result);

		String result2 = calSum2();
		System.out.print("A ~ Z : " + result2);


	}//main end!!!!!

	//반환유형 이름()
	static int calSum() { 

		//여기 싹 사용가능
		//1~10까지의 합
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum; //합계를 반환한다!	
	}

	//문자열 반환
	static String calSum2() { //반환값 O, 매개변수 X

		//A~Z 문자열 합.
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			str += c + " ";
		}
		return str; //문자열 반환.
	}


}//

