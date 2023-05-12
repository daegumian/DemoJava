package quiz01;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키와 나이를 입력하세요");
		System.out.print("키>");
		double tall = scan.nextDouble();
		System.out.print
		("나이>");
		int age = scan.nextInt();
		System.out.println("키가" + tall + "cm이고" +" "+ age +"이네여. 고로");
		if(tall >=140 & age >= 8) {
			System.out.print("놀이기구 탑승 쌉가능");
		} else {
			System.out.println("밥 더 먹고 오세여.");
		}
		scan.close();
	}
	

}
