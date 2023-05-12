package quiz18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
 * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
 * 3. 분리한 토큰의 개수를 출력
 * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
 *    1. 안녕
 *    2. 하세요.
 *    3. 오늘은 
 * 5. 분리된 문자열을 배열에 저장
 */
public class TokenQuiz01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = "";
		int count = 0;
		String str3 = ". ";
		StringTokenizer token1 = new StringTokenizer(str1, " ");
		
		System.out.println("토큰의 갯수 : "+ token1.countTokens());
		String[] arr = new String[str1.length()];
		while(token1.hasMoreTokens() != false) {
			count ++;
			str2 = count+str3+ token1.nextToken();
			arr[count-1] = str2;
			System.out.println(str2);
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
	}

}
