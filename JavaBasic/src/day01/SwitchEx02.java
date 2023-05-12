package day01;

import java.util.Scanner;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		//switch문장의 else-if문과 상당히 유사함
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수 입력:");
		int point = scan.nextInt();
		//변수의 연산식이 들어갈 수 있따.
		switch (point / 10) {
		case 9:
			//제어문? 다들어갈 수 있따. if,else-if
			if(point >= 95) {
				System.out.println("A+학점");
			}else {
				System.out.println("A학점");
			}
			break;
		case 8:	System.out.println("B학점");	
			break;
		case 7:	System.out.println("C학점");
			break;
		case 6:	System.out.println("D학점");
			break;
		default:System.out.println("과락나락");
			break;
		}
		
		scan.close();
	}
}
