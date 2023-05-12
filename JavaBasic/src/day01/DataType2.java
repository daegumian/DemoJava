package day01;

public class DataType2 {

	 public static void main(String[] args) {
		
		 //단일문자를 저장하는 char = 2byte
		 char c1 = 'a';
//		 char c2 = 'abc'; <- 2개 이상은 저장이 안됨.
		 char c3 = 65; // <- 아스키코드, 유니코드?
		 //아스키코드 1바이트
		 //유니코드 2바이트 부호없는 비트체계
		 char c4 = '가';
		 char c5 = 44081;//유니코드 10진수
		 char c6 = '\uAc31';//유니코드
		 System.out.println(c1);
		 System.out.println(c3); 
		 System.out.println(c4); 
		 System.out.println(c5); 
		 System.out.println(c6); 

		 //문자열을 저장할 수 있는 String
		 String s1 = "공백도 문자열이다 ."; //아스키코드값을 가지고 잇음.
		 String s2 = "말입니다.";
		 //문자붙일때 + 를 사용
		 System.out.println(s1 + s2);
		 
		 //문자와 다른값에 + 연산 = 문자열!
		 System.out.println(100 + 100);//200
		 System.out.println("100"+100);//100100
		 System.out.println(100 + 100 + "100");//200100
		 
		 //형 변환
		 System.out.println("A" + 10);//A10 -> String + int = String
		 System.out.println('A' + 10);//75 -> char + int = int
		 
	 }
}
