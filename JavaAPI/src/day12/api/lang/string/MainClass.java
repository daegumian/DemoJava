



package day12.api.lang.string;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
//		char[] arr = {'a','b','c'};
//		String str = new String(arr);
		
		String str = "안녕하세요~";
		System.out.println(str); //안녕하세요~
		
		char c = str.charAt(0);//대표적인 메서드 //한글자 자르기
		System.out.println(c); //안
		
		//찾으면 인덱스번호를 반환, 없다면 -1로 반환
		str.indexOf(str, 3);
		System.out.println(str.indexOf("안녕")); //0
		System.out.println(str.indexOf("xx")); //-1
		
		if(str.indexOf("안녕") != -1) {//"~~" 있다면~
			System.out.println("문자에 값이 존재함"); //문자에 값이 존재함
		}
		
		//문자열 끝에서부터 값을 찾음
		System.out.println(str.lastIndexOf("안녕"));//0
		
		
		//contains//charactersquence(문자열모형)도 가능 //문자가 있으면 true 없으면 false
		if(str.contains("안녕")) {
			System.out.println("문자에 값이 존재함"); //문자에 값이 존재함
		}
		
		//length.
		System.out.println("문자열의 길이 : "+str.length());
		//문자열의 길이 : 6
		
		System.out.println("-------------------------------");
		
		//문자열 변경 replace //원본 문자열은 바뀌는 것은 아니다. final이기 때문에.
		str = "자바의 기원은, 자바칩프라페치노 커피집에서 시작되었습니다"; //정말 바꾸고싶다면 통째로 바꾸어야한다.
		
		System.out.println(str.replace("자바", "java"));
		//java의 기원은, java칩프라페치노 커피집에서 시작되었습니다
		
		System.out.println(str.replaceFirst("자바", "java"));
		//java의 기원은, 자바칩프라페치노 커피집에서 시작되었습니다
	
		System.out.println(str.replace(" " , ""));
		//자바의기원은,자바칩프라페치노커피집에서시작되었습니다
		
		
		System.out.println("--------------------------------------------");
		
		//문자열 자르기 substring
		System.out.println(str.substring(9)); //9미만 절삭
		//자바칩프라페치노 커피집에서 시작되었습니다
		
		System.out.println(str.substring(9, 17)); //9이상 17미만
		//자바칩프라페치노
		
		String[] arr = str.split(" ");//"~~" 기준으로 잘라서 String배열에 순서대로 저장해준다. 저장할 배열의 수 만큼.
		System.out.println(Arrays.toString(arr));
		//[자바의, 기원은,, 자바칩프라페치노, 커피집에서, 시작되었습니다]
		
		String[] arr2 = str.split(" ", 3); //최대 배열의 길이는 3
		System.out.println(Arrays.toString(arr2));
		//[자바의, 기원은,, 자바칩프라페치노 커피집에서 시작되었습니다]
		
		char[] arr3 = str.toCharArray();//한글자씩 잘라서 char배열에 순서대로 저장!
		System.out.println(Arrays.toString(arr3)); 
		//[자, 바, 의,  , 기, 원, 은, ,,  , 자, 바, 칩, 프, 라, 페, 치, 노,  , 커, 피, 집, 에, 서,  , 시, 작, 되, 었, 습, 니, 다]
		
		//문자열 비교 : boolean 반환
		str = "홍길동";
		System.out.println(str.equals("홍길동"));
		
		//사전 등재순의 비교
		System.out.println(str.compareTo("홍길동")); //0 : 같은문자 //0
		System.out.println(str.compareTo("홍길자")); //음수 : str이 홍길자 보다 사전등재순 앞에 위치함 //-5047
		System.out.println(str.compareTo("홍길가")); //양수 : str이 홍길가 보다 사전등재순 뒤에 위치함 //2009
		
		//특정 구분자로 문자열을 연결! (...은 나열이 가능하다는 뜻.)
		System.out.println(String.join("-", "hello", "world", "안녕", "하세요")); 
		//hello-world-안녕-하세요
		
		//기본타입을 문자열로 변경
		System.out.println(String.valueOf(1) + String.valueOf(2)); // 12
		System.out.println(""+1 +2);//12 //""을 붙이는 이유는 String으로 저장하기 위해서!
		
	}
}
