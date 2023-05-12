package day11.trycatch;

public class TryCatchEx02 {

	public static void main(String[] args) {
		
		//반복문에서의 예외처리 -> 곰곰히 많이 생각을 해봐야한다! 조금 헷갈릴 수가 있어서!
		String[] arr = {"박동훈","이현규","이시형"};
		
		int i = 0;
		while (i<4) {
			
			try {
				
				System.out.println(arr[i]);
			} catch (Exception e) {
				
				System.out.println("배열의 범위를 벗어낫다규");
			}finally { // 에러가 나도 출려되게 만든다.
				System.out.println("이 문장은 무조건 나온다잉");
			}
			
			i++;
		}
		
		System.out.println("프로그램 정상종료");
		
	}
	
}
