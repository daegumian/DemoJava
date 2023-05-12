package day01;

public class Oprator05 {

	public static void main(String[] args) {
		
		//프로그램에서 랜덤한 값을 발생시키는 기능
		System.out.println(Math.random());//1미만의 랜덤한 double 값
		
		//1~10까지 랜덤한 값
		double d = Math.random() * 10; // 다른 방법 1
		System.out.print("1~10까지의 랜덤수:");
		System.out.printf("%.0f", d);
		System.out.println();
		
		double c = Math.random() * 10; // 예제 1
		int a = (int)c + 1; //1~10
		System.out.println("1~10까지 랜덤수:" + a);
		System.out.println();
		
		//한번에 적으면? //예제 2
		int result = (int)(Math.random()*10)+1;
		System.out.println(result);
		
		//삼항연산식
		//조건 ? 연산1 : 연산2
		
		String p = result % 2 == 0 ? "짝수" : "홀수"; //값이 문자열이니 문자열로 저장
		System.out.println(p);
		
		String k = result % 2 == 0 ? "롱" : "숏";
		System.out.println(k);
		
		int i = 1;
		
		int u = 2 * (a+1) +(a-2);
		System.out.println();
		
		
		
		
		
	}
}
