package day12.api.lang.sb;

public class StringBuilderEx {

	public static void main(String[] args) {
		
//		String str = new String("Java");
		
		//StringBuilder - 단일 쓰레드 환경에서 사용
		//StringBuffer - 멀티 쓰레드 환경에서 사용
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		str = str + "program";
		
		System.out.println(str + "program");//원본 안바뀜
		sb.append("program"); //원본 변함.
		
		System.out.println(str);
		System.out.println(sb);
		
		//빌더의 메섣
		//append - 문자열 끝에 추가
		sb.append("ming");
		System.out.println(sb);
		
		//insert(0 - 문자열 중간에 추가
		sb.insert(5, "study");
		System.out.println(sb);
		
		//replace
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		//delete()삭제
		sb.delete(5, 9);//이상~미만
		System.out.println(sb);
		
		sb.deleteCharAt(0);//인덱스번째 삭제
		System.out.println(sb);
		
		//reverse 문자열 구꾸로 저장하기
		sb.reverse();
		
		//toString() - 문자열 형변환
		String result = sb.toString();
		System.out.println(result);
		
		
		
		
	}
}
