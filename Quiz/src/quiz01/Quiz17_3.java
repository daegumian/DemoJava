package quiz01;

import java.util.Scanner;

//오후에...
//문제 풀이 프로그램 0을 치면 종료
//프로그램 정상 종료
//정답 : 3
//오답 : 2
//연산자도 랜덤 0이면 덧셈 1이면 뺄셈
//마산식
public class Quiz17_3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int count1 = 0;
		int count2 = 0;

		String i = "";

		while(true) {

			int a = (int)(Math.random()*2);
			int b = (int)(Math.random()*100)+1;
			int c = (int)(Math.random()*100)+1;

			if(a==0) {
				i = "+";
			}else {
				i = "-";
			}

			System.out.println("종료를 원하면 0을 입력");
			System.out.println(b + i + c);
			System.out.println("정답은? >");
			int answer = scan.nextInt();
			if(answer == 0) {
				System.out.println("정답 횟수"+count1);
				System.out.println("오답 횟수"+count2);
				break;

			}
			if(a==0) { 
				if(answer==(b+c)) {
					System.out.println("***정답***");
					count1 ++;
				}else {
					System.out.println("***오답***");
					count2++;
				}
			}else if(a==1) {
				if(answer==(b-c)) {
					System.out.println("정답");
					count1++;
				}else {
					System.out.println("오답");
					count2++;
				}
			}


		}
	}

}
