package day01;

public class Identifier {

	public static void main(String[] args) {
		
		//대소문자를 구분함
		int age = 27; // 변수는 소문자 국룰
		int Age = 28; // 국룰 어김, age랑 Age랑 다르게 인식.
		
		System.out.println(age);
		System.out.println(Age);
		
		//숫자로 시작할 수 없음
//		int 4num = 10; //행주석 - ctrl + /
		int num4 = 10;
		
		//카멜표기법
//		int phonenumber = 10;
		int phoneNunber = 10; // 이게 맞음! 카멜쓰~
		
		//키워드로는 쓸 수 없음
//		int class = 10;
		
	}
}
