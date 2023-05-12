package day11.trycatch;

public class ThrowsEx01 {
	public static void main(String[] args) {
		
			/*
			 * 메서드나 생성자에서 발생되는 예외를 호출문장으로 넘기는 키워드 throws입니다.
			 * throws구문이 붙어있는 생성자 or 메서드 는 예외처리를 대신 진행한다.
			 */
			
			try {
				greeting(10);
				
			} catch (Exception e) {
				System.out.println("에러가 발생했습니댱");
				e.printStackTrace(); //에러가 발생했을 때 에러로그 확인하기 위해서 많이 사용.!!!//웬만하면 다 찍어두어라!
			}
		
			//throws의 예시
			try {
				Class.forName("!@#!@!%!@$");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		
		
			
		
		System.out.println("프로그램 정상종료");
		
		
		
		
		
	}
	
	private static String[] arr = {"hello", "bye", "say good bye"}; //메인에서 바로 쓸거라서 static을 붙인다
	
	public static void greeting(int index) throws Exception { //메인에서 바로 쓸거라서 static을 붙인다
		System.out.println(arr[index]);
	}
	
	
}
