package quiz18;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayQuiz01 {

	public static void main(String[] args) {

		//arr과 arr2는 길이가 1차이가 난다.
		//arr은 마라톤 참가자이다
		//arr2는 마라톤 완주자이다
		//완주하지 못한 사람을 리턴하는 메서드를 만드세요.


		String[] arr = {"홍길동", "홍길자", "이순신", "신사임당"};
		String[] arr2 = {"홍길동", "이순신","홍길자"};

		test(arr, arr2);

	}

	
	public static String test(String[] arr, String[] arr2) { //틀렸다. 완주자 홍길자가 마지막에 오는경우에 
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int num = arr.length - arr2.length;
		String result = "";
		if(Arrays.equals(arr, arr2)) {
			System.out.println("모두 완주입니다.");
		}else {
			String[] newArr3 = Arrays.copyOfRange(arr, arr2.length, arr.length+1);
//			Arrays.sort(newArr3);
			for (int i = 0; i < num; i++) {
				result += newArr3[i];
			}
			
			System.out.println("마라톤 미완주자는 : " + result + "입니다.");

		}

		return result;
	}

}
