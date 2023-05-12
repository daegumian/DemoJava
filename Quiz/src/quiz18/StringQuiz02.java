package quiz18;
/*
 * masking(String)
* 마스킹 메서드는 주민번호값이 매개변수로 들어올 때
* 950101-*******로 마스킹 처리하여 리턴하는 static메서드를 만들어주세요.
* 
* 조건
* 1. 문제의 간소화를 위해 생년월일은 정상범위라고 가정합니다.
* 2. 13자리가 아니거나, 남,여 가 아니라면 throws처리합니다.
* 3. 주민번호는 - 를 포함해서 받을 수 있습니다.
* 4. 남, 여에 대한 정보를 출력해줍니다.
*  
* masking메서드를 만들어주세요 
* 검증데이터 950101-1000000 -> 남자 7 or 6이 2아니면1
* 검증데이터 9501012000000 -> 여자
* 검증데이터 950101-5000000 -> 예외
* 검증데이터 9501015000000 -> 예외
* 검증데이터 950101511111 -> 예외
 */

import java.util.Scanner;

public class StringQuiz02 {
	static Scanner sc = new Scanner(System.in);

//	String ssn = sc.nextLine();
	public static String masking(String ssn) throws Exception {
		String num1 = "-*******";
		String male = "1";
		String female = "2";
		String b = "";
		String c = "";
		
		b += ssn.charAt(7);
		
		c += ssn.charAt(6);
		try {
			if (ssn.length() >= 13) {
				if((male.equals(b)) | (female.equals(b)) | (male.equals(c)) | (female.equals(c))) {
					
					if(male.equals(b)|male.equals(c)) {
						b = ssn.substring(0, 6);				
						male = ssn;
						System.out.println(b+num1);
						System.out.println("남자입니다");
					}
					else if(female.equals(b)|female.equals(c)) {
						b = ssn.substring(0, 6);
						female = ssn;
						System.out.println(b+num1);
						System.out.println("여자입니다");
					}
				}
			}

		} catch (Exception e) {
			System.out.println("주민번호를 잘못 입력하셨습니다.");

		}
		
		return null;

	}

}
