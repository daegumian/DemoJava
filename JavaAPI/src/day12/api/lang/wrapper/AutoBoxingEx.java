package day12.api.lang.wrapper;

public class AutoBoxingEx {

	public static void main(String[] args) {
		
		//Autoboxing: 기본타입 ~ 클래스형 간의 자동형변환
		Integer val1 = 100;//기본타입을 객체로 반들기
		int b = val1;//되돌리기!!

		Double val2 = 3.14;//기본타입을 객체로 반들기
		double c = val2;//되돌리기!!
		
		//래퍼클래스의 특별한 기능들
		//문자열 => 기본형으로 변환
		
		int result1 = Integer.parseInt("10");
		double result2 = Double.parseDouble("3.14");
		long result3 = Long.parseLong("10");
		
		System.out.println(result1 + result2 + result3); // 23.14
		
		
		
		System.out.println(Integer.compare(3, 5)); //앞에 값이 뒷값보다 작으면 음수 // -1
		System.out.println(Integer.compare(5, 3)); //앞에 값이 뒷값보다 크면 양수 // 1
		System.out.println(Integer.compare(3, 3)); //앞에 값이 뒷값이랑 같으면 0 // 0
		
		
	}
}
