package quiz01;

import java.util.Scanner;

//오후에...
//문제 풀이 프로그램 0을 치면 종료
//프로그램 정상 종료
//정답 : 3
//오답 : 2
//연산자도 랜덤 0이면 덧셈 1이면 뺄셈
//내식
public class Quiz17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int count1 = 0;
		int count2 = 0;
		
		while(true) {
		
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*100)+1;
		int c = (int)(Math.random()*2)+1;
		int d = a+b; //이걸 줄일 수 있다.
		int f = a-b; //이걸 줄일 수 있다.
		int an1 = 0;
		int an2 = 0;
			
			if(c==1) {
				System.out.println(a + " + " + b + " = ");
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				//이걸 줄일 수 있다.
				
				an1 = scan.nextInt();
				if(an1==0) {
					System.out.println("프로그램 정상 종료");
					System.out.println("정답:"+count1);
					System.out.println("오답:"+count2);
					break;
				}
				else if(an1==d) {
					System.out.println("정답!");
					System.out.println("----------------------------");
					count1 ++;
				}
				else{
					System.out.println("오답입니다!");
					System.out.println("----------------------------");
					count2 ++;
				}
			}
			else if(c==2) {
				System.out.println(a + " - " + b + "= ");
				System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
				//이걸 줄일 수 있다.
				
				an2 = scan.nextInt();
				if(an2==0) {
					System.out.println("프로그램 정상 종료");
					System.out.println("정답:"+count1);
					System.out.println("오답:"+count2);
					break;
				}
				if(an2==f) {
					System.out.println("정답!");
					System.out.println("----------------------------");
					count1 ++;
				}else {
					System.out.println("오답입니다!");
					System.out.println("----------------------------");
					count2 ++;
				}
			}
		}

	}

}
