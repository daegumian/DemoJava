package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//문자열다루기
		//문자열은 사실 배열입니다. 문자열은 인덱스가 있다.
		
		String str = "안녕하세요~";
		String str1 = "안녕하세요~영어로 하면 하이!";
//		System.out.println(str[0]); //안돼! 자바에선!
		
		//문자열을 다루는 다양한 메서드를 제공
		//문자열을 한글자 자르기
		char c = str.charAt(0); // ex) s.~~~~ :(콜론) 뒤는 이것으로 돌려준다.
		System.out.println(c);
		
		//문자열의 위치확인 indexOf, lastIndexOf => 없다면 -1을 반환(굉장히 중요하나 개념)
		int idx = str.indexOf("녕"); // 0  
		System.out.println(idx); // 0
		
		int idx2 = str1.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 위치:" + idx2); //뒤에서부터 찾은 위치:13
		
		//문자열 변환 toUpperCase(대문자로), toLowerCase(소문자로)
		String s = "abcDEF";
		
		String result = s.toLowerCase(); // ※주의※ ❤원본 문자열은 그대로 유지❤
		System.out.println(result); //소문자로. 주의할 점. abcdef
		System.out.println(s);// abcDEF
		
		String result2 = s.toUpperCase();// ※주의※ ❤원본 문자열은 그대로 유지❤
		System.out.println(result2); // ABCDEF
		
		System.out.println("==========================================");
		//문자열 변경 replace : 중요한 기능 중 하나
		s = "abcdefaaa";
		
		String result3 = s.replace("a", "x");
		System.out.println(result3); //a -> x로 변경, ☺(전부다)☺ // xbcdefxxx☺
		System.out.println(s);//※주의※ ❤원본 문자열은 그대로 유지❤ // abcdefaaa
		
		String result4 = s.replaceFirst("a", "x");
		System.out.println(result4); // xbcdefaaa
		
		System.out.println("==========================================");
		//공백제거 trim
		str = "     010-5555-1234   ";
		String result5 = str.trim(); //앞뒤에만 공백을 제거해서 반환.
		System.out.println(result5); //※주의※ ❤원본 문자열은 그대로 유지❤
		
		str = " 안녕 하 세요? 신사숙 녀 여러 분?  ";
//		String result6 = str.trim(); // 010-5555-1234
//		System.out.println(result6);//중간중간에 끼어 있는 공백은 삭제 X 어떻게 지울까?
		str = str.replace(" ", ""); //공백을 전부 제거해서 원본 문자열에 저장, 많이 사용!
		System.out.println(str); // 안녕하세요?신사숙녀여러분?
		
		System.out.println("==========================================");
		//문자열 자르기, 👍👍중요
		//substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result7 = str.substring(9);
		System.out.println(result7); // 2222
		
		//str 변함없음
		String result8 = str.substring(4, 8); // 4 <= x < 8 인덱스 추출
		System.out.println(result8); // 1111
		System.out.println(str); // 원본 변함없음.
		
		//split - 특정 문자를 기준으로 자름 (정말 제대로 사용하려면 정규표현식을 알아야함) 짱짱! 좋은 기능
		String[] arr1 = str.split("-");
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr1)); //010, 1111, 2222
		System.out.println(Arrays.toString(arr2)); // 0,1,0,-,1,1,~~,2,2 //String[]형
		
		//toCharArray - 한글짜씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3)); //char[]형
		
		System.out.println("==========================================");
		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열 길이 : " + len);
		
		//문자열의 비교 equals() <-- ***무조건 외우기***
		if(str.equals("안녕하세요") ) {
			System.out.println("두 문자가 같음"); //두 문자 같음
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("녕")) {
			System.out.println("'녕'이 포함되어 있음"); // '녕'이 포함되어 있음
		}
		
	}
	
}
