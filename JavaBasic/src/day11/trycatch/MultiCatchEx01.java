package day11.trycatch;

public class MultiCatchEx01 {

	public static void main(String[] args) {

		//참고
		//메인메서드도 매개변수를 받을 수 있다.
		//run > run configuration -> argumnet 탭1 -> ${string_prompt}

		try {

			String a1 = args[0];
			String a2 = args[1];

			//정수로 변경
			int num1 = Integer.parseInt(a1);
			int num2 = Integer.parseInt(a2);
			System.out.println("두 수의 합 : " + (num1 + num2));

			String str = null;
			str.charAt(0);
			
			//catch문에는 에러를 처리할 정확한 에러클래스가 선언된다.	
			//Exception은 모든 예외클래스의 부모다.(모든예외처리쌉가능)
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어남(매개변수를 2개 입력하세요)");

		} catch (NumberFormatException e) {
			System.out.println("숫자를 써라잉!");

		} catch(Exception e){ //모든 예외를 받음 tip. ctrl + t : 부모와의 상속관계를 알아볼수 있따. 
			System.out.println("기타 예외얌!!!"); //이거 하나만 적거나 맨 아래에 적어라.
		}
	}

}
