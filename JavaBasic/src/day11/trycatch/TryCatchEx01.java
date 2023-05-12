package day11.trycatch;

public class TryCatchEx01 {
	
	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		try {
			System.out.println(i/j);

			//catch 뒤에는 예외를 처리할 수 있는 예외의 클래스가 선언됨.
			//Exception은 모든 예외를 전부 처리할 수 있
		} catch (Exception e) {

			System.out.println("0으로 어떻게 나눕니까!!빠가야로!!");
		}	
		
		System.out.println("프로그램 정상종료");
		
		
	}
	

}
