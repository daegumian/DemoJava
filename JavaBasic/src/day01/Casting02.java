package day01;

public class Casting02 {

	public static void main(String[] args) {
		
		int i = 70;
//		char c = i; -> 큰 게 작은 거에 못들어감
		char c = (char) i; // <- 수동 작업을 하면 들어갈 수 있음.
		short s = (short)i;
		System.out.println(c); //문자형으로 담겨 아스키코드 70인 F를 가르킴.	
		System.out.println(s);
		
		float f = 3.14F;
		int k = (int)f;
		System.out.println(k);
		
		//주의할점 - 타입변환 -> 범위 밖 들어오면 -> 잘려나가간 값만 저장.
		int a = 1000;
		byte b = (byte)a; 
		System.out.println(b); //-24
		
		//특이케이스 - 문자와 숫자 같아도 명시적 형변환.
		char cc = 'A';
		short ss = (short)cc;
		
	}
}
