package day02;

import java.util.Scanner;

public class WhileEx03 {

	public static void main(String[] args) {
		
		//어떤 수를 입력받아서 입력받은 수가 (소수)인지 판별.
		//소수 - 나누어 떨어지는 수가 1과 자기자신인 수
		System.out.println("판별할 소수를 입력하세요:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//코드의 기본 -> 심플 이즈 베스트.
		
		int i = 2;
		while(num % i != 0) {
						
			i++;
		}
		System.out.println(num == i ? num+"은 소수" : num + "은 소수가 아님");
		//왜 num == i ? 이게 소수일까? 다시 설명해보기
		
		scan.close();
	}
}
