package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		
		/*
		 * return이란
		 * 1. 메서드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용된다.
		 * 
		 * 3. 반환값(리턴)은 없을 수도 있따. 없는 경우 void로 선언한다.
		 * 4. void메서드도 return 사용 가능.
		 * 	- 값을 돌려주지는 못하고, 종료의 의미.
		 * 
		 */

		//소괄호가 있는 것은 전부 메서드이다.
		System.out.println(add(1,2));

		int result = add(add(1,2), add(3,5));

		System.out.println("결과 : " + result);

		//void형 메서드는 return이 없기 떄문에 단순히 호출만 가능하다.
		//System.out.println(sub()); //리턴값이 없어서
		sub(); //실행만 할 수 있어서 // {5 - 3 = 2}
		div(6,2);// 호출만 함. 반환X // {6 / 2 = 3}
		
		noReturn("hello");
		

	}//main end

	static int add(int a, int b) {
		return a + b;
	}

	//반환 X, 매개변수 X.
	static void sub() { //void로 선언해서 return을 안적어도 된다. 실행하고 끝! //반환없는 메서드.
		System.out.println("5 - 3 = 2");
	}

	//반환 X, 매개변수 X.
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b) ); 
	}

	static void noReturn(String s) {

		if(s.equals("hello")) { //문자열 비교는 "==" 사용 X -> .equals(조건)을 사용. 
			System.out.println("메서드를 종료함니당!");
			return;
		}

		System.out.println("hello를 전달해야 할껄요?");
	}

}
