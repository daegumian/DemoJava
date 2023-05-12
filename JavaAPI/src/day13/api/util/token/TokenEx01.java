package day13.api.util.token;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {

		//빠른 문자열 분리
		//split()
		//toCharArray()

		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다.";

		StringTokenizer token1 = new StringTokenizer(str1); //delim은 구분자란 뜻.

		//토큰의 갯수 확인
		int cnt = token1.countTokens();
		System.out.println("나눠진 문자열 갯수 : " + cnt);

		//다음 토큰의 여부확인
		System.out.println(token1.hasMoreTokens());

		while(token1.hasMoreTokens() != false) {

			//			다음 토큰의 확인
			System.out.println(token1.nextToken());
			/*
			나눠진 문자열 갯수 : 6
			true
			오늘은
			날씨가
			맑고,
			매우
			시원하지
			않습니다.
			*/

		}


		System.out.println("-------------------------------");
		//다양한 구분자를 한번에 지정해서 토큰화 가능

		String str2 = "2050/1131/고길동/010-1234-5678/뉴욕시/www.apple.com";

		// /(슬래시),-(하이픈),.(점)기준으로 잘림 lol!
		StringTokenizer token2 = new StringTokenizer(str2, "-/.");

		while(token2.hasMoreTokens() != false) {

			System.out.println(token2.nextToken());
			/*
			2050
			1131
			고길동
			010
			1234
			5678
			뉴욕시
			www
			apple
			com
			 */
		}

		System.out.println("----------------------------------");
		//구분자를 토큰에 포함시킴
		StringTokenizer token3 = new StringTokenizer(str2, "/", true);

		for(int i = 1; token3.hasMoreTokens(); i++) {

			System.out.println(token3.nextToken());
			/*
			2050
			/
			1131
			/
			고길동
			/
			010-1234-5678
			/
			뉴욕시
			/
			www.apple.com
			 */
		}
	}

}
