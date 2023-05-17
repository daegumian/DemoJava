package day01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
	
		//자바의 입력
		//1. 스캐너 객체 필요
		Scanner scan = new Scanner(System.in);
		
		
		
		//2. 스캐너가 가지고 있는 입력기능을 사용해서 데이터를 입력받음.
		System.out.print("이름이 어케댐?");
		String name = scan.next(); //입력을 받을 수 있는 상태. 문자를 받는다.
		
		
		System.out.print("나이가 어케댐?");
		int age = scan.nextInt(); //정수
		
		System.out.print("키가 어케댐?");
		double tall = scan.nextDouble(); //실수
		
		System.out.println("이름은?" + name +", "+"내 나이는:"+age+ ", "+"키는?" + tall +"cm"+"이다 이새키야");
		
		//3. 스캐너 자원해제 : 해주는게 좋다.
		scan.close();
		
	}
}
