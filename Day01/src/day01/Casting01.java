package day01;

public class Casting01 {

		public static void main(String[] args) {
			
			//작은 타입을 큰 타입에 넣으르 떄는 자동형변환이 일어난다.
			//크기만 잘 기억하면 쉽게 이해가능
			byte a = 10;
			
			short s = a; // byte -> short 자동형변환
			int i = a; // byte -> int 자동형변환
			long l = a; // byte -> long 자동형변환
			
			//문자와 숫자간에도 유효함.
			char c = '가'; //char 2, int 4
			int j = c;
			System.out.println(j);
			
			int k = 1000;
			double d = k; //int -> double 형변환
			System.out.println(d);
			
			//데이터타입 크기 -> byte<short<int<long<float<double
		
			
		}
}
