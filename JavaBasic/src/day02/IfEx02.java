package day02;

import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		
		//if else 구문 : 위에서 순서대로 해야댐
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("점수입력>");
		int point = scan.nextInt();
		
		if(point >=90) {
			//95점 이상
			if(point >= 95) {
				System.out.println("A+학점");
			}else { //90 <= x < 95
				System.out.println("A학점");
			}
			
			System.out.println("상위 10프로네요!");
			
		}else if(point>=80) {
			System.out.println("B학점"); //elseif의 구문의 특성 때문에 89~80사이가 됨.
		}else if(point>=70) {
			System.out.println("C학점");
		}else if(point>=60) {
			System.out.println("D학점");
		}else {
			System.out.println("과락입니다.");
		}
		
		
		scan.close();
		
	}
}
