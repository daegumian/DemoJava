package p0428_quiz16;

import java.nio.file.attribute.AclEntry;
import java.util.Scanner;

public class UpnDownException {

	/*
	 * 
	 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있또록 코드를 변경
	 * try-catch 사용
	 * 
	 * 
	 /*
	 * updown 게임
	 * 1~100까지 랜덤한 수를 1번 생성합니다.(반복문 밖에서) 랜덤수
	 * 스캐너를 통해서 값을 입력받습니다.
	 * 랜덤 수가 입력받은 값보다 작으면 "더 작은 수를 입력하세요."if
	 * 랜덤 수가 입력받은 값보다 크면 "더 큰 수를 입력하세요."else
	 * 정답을 맞추면 : 시도횟수 : x회를 출력하고 종료 : count하고 다시 돌아가고 정답 맞추면 break 후 출력
	 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.print("UP&DOWN 게임 정답 입력:");
		Scanner scan = new Scanner(System.in);
		int answer = 0;
		int count = 0;
		while(true) {
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
		}
	}




}
