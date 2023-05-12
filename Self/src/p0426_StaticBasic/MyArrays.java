package p0426_StaticBasic;

public class MyArrays {

	/*
	 * 
	 * Arrays클래스의 toString메서드 똑같이 만들기
	 * 1. 외부에서 객체 생성하지 못하도록 생성자에 접근제어자를 붙입니다.
	 * 2. printArray() 생성하는데, 배열을 매개변수로 받아서 toString처럼 리턴되도독
	 * 	  메서드 오버로딩(String)(int)(char)
	 * 
	 */

	private MyArrays() {
		
	}
	
	public static String printArray(char[] a) {
		
		String str = "[";
		for (int i = 0; i < a.length; i++) {
			str += a[i];
			
			if(i < a.length-1) {
				str += ",";
			}
		}
	
		str += "]";
		return str;
	}
	public static String printArray(int[] a) {
		
		String str = "[";
		for (int i = 0; i < a.length; i++) {
			str += a[i];
			
			if(i < a.length-1) {
				str += ",";
			}
		}
	
		str += "]";
		return str;
	}
	public static String printArray(String[] a) {
		
		String str = "[";
		for (int i = 0; i < a.length; i++) {
			str += a[i];
			
			if(i < a.length-1) {
				str += ",";
			}
		}
	
		str += "]";
		return str;
	}
	
	
}
