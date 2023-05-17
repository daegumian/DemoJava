package day02;

public class SwithEx01 {

	public static void main(String[] args) {
	
		double c = Math.random() * 10; // 예제 1
		int a = (int)c + 1; //1~10
		int b = 2;
		//switch문장의 소괄호에는 변수나, 변수의 연산식 등이 들어감.
		//타입은 - 정수, 문자, 문자열이어야 함. 실수는 X.
		System.out.println(a);
		switch(a){
		case 1: System.out.println("ㅎ2");
		break;
		case 2: System.out.println("ㅂ2");
		break;
		case 3: System.out.println("ㅁ2");
		break;
		case 4:
		case 5:
		case 6:
		case 7: System.out.println("ㅇ2");
		break;
		default: System.out.println("ㅋ2");
			
		}
	}
}
