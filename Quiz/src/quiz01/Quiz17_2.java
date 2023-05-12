package quiz01;

import java.util.Scanner;

//오후에...
//문제 풀이 프로그램 0을 치면 종료
//프로그램 정상 종료
//정답 : 3
//오답 : 2
//연산자도 랜덤 0이면 덧셈 1이면 뺄셈
//선생님식
public class Quiz17_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int okCount = 0;//누적시킬 변수는 while문 바깥쪽에, 새롭게 생성되어 초기화가 되면 안되니까.
		int noCount = 0;//누적시킬 변수는 while문 바깥쪽에, 새롭게 생성되어 초기화가 되면 안되니까.
		
		while(true) {
		
			int num1 = (int)(Math.random()*100)+1;//계속 새롭게 생성하려면 while문 안으로!
			int num2 = (int)(Math.random()*100)+1;//계속 새롭게 생성하려면 while문 안으로!
			int oper = (int)(Math.random()*2);//계속 새롭게 생성하려면 while문 안으로!
			
			System.out.println("---------------------------");
			System.out.println(num1 + (oper == 0 ?" + " : " - ")+ num2 + " = ?"); //**킬포**
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			System.out.println(">");
			int answer = scan.nextInt();
			
			int correct = oper ==0? num1+num2 : num1-num2; //실제 정답 **킬포**
			
			if(answer == 0) { 
				System.out.println("정답횟수:" + okCount);
				System.out.println("오답횟수:" + noCount);
				break; //가장 가까운 반복문 탈출
			}
			
			if(answer == correct) { //정답
				System.out.println("정답입니다.");
				okCount ++;
			}else { //오답
				System.out.println("오답입니다.");
				noCount --;
			}

		}
		
	}

}
