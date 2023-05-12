package quiz16;

import java.util.Scanner;

public class MainClass {

	/*
	 * updown 게임
	 * 
	 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있또록 코드를 변경
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		Scanner scan = new Scanner(System.in);
		System.out.print("UP&DOWN 게임 정답 입력:");
		int count = 0;
		int answer = 0;
		while(true) {
			try {
			answer = scan.nextInt();
			count ++; // 한번의 입력은 한번의 시도 횟수다.
			if(answer > num) {
				System.out.println("작은 수를 입력하세요.");
			}
			else if(answer < num){
				System.out.println("큰 수를 입력하세요."); 
			}else {
				System.out.println("정답입니다.");
				System.out.println("시도 횟수:"+count);
				break;
			}
			} catch (Exception e) {
				System.out.println("숫자를 입력하세용");
				scan.next();
				count++;
			}
		}
			
	}


}
