package quiz18;

import java.util.Arrays;
import java.util.Scanner;

public class StringQuiz01 {

	/*
	 * 스캐너 사용해서 id를 입력받는다
	 * 아이디는 공백을 포함해서 받을 수 있습니다. nextLine()
	 * 
	 * 단, 공백을 제거한 아이디가 5글자 미만이면 다시 입력을 받습니다.
	 * 	  5글자 이상이라면 "id가 등록되었습니다" 출력후 종료
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id = sc.nextLine();

		int i=0;
		while(id.replace(" ", "").length() < 5) {
			System.out.println("공백 없이 5글자 이상 입력하세요");
			id = sc.nextLine();
			i++;
		}
		System.out.println("id가 등록되었습니다.");
	}

}
