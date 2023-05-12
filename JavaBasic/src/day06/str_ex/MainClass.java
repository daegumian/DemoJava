package day06.str_ex;

public class MainClass {

	public static void main(String[] args) {
		
		String str1 = "박동훈";
		String str2 = "박동훈";
		String str3 = new String("박동훈");
		String str4 = new String("박동훈");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println();
		
		//같은 파일에서 선언한 박동훈 같은 객체를 참조
		System.out.println(str1 == str2);
		//직접 생성명령을 내리거나 다른클래스에서 넘어온 String은 다른 주소를 나타내게 됨. 힙메모리 주소값이 달라 다르다고 나옴
		System.out.println(str1 == str4); 
		//문자열 동등비교시엔 == 대신에 equals() 메서드 사용해서 비교.
		System.out.println(str3.equals(str4));
		
		//null safety. null 안정성이 없음.
		if(str1.equals(str3)) {
			System.out.println("두 문자가 같음");
		}
		
		//이렇게 null안정성 극복.
		if(str1 != null && str1.equals(str3)){
		System.out.println("두 문자가 같음");
	}
	
		
		
		
		
		
		
		
	}
}
