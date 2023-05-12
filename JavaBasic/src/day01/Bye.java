package day01;

public class Bye {

	public static void main(String[] args) {

		//main이라 쓰고 ctrl + space를 누르면 실행함수가 만들어진다. -> 자동완성 기능
		/*
		 * ctrl + s = 저장
		 * ctrl + fll = 실행
		 * sysout이라 적고 ctrl + space 출력문 자동완성
		 * 
		 * 코드 이동 : alt + 방향키
		 * 코드 복사 : alt + ctrl + 방향키 -> 커서 두고
		 *		 되돌리기 : ctrl + z
		 * 전체 선택 : ctrl + a
		 * 전체 정렬 : ctrl + i 
		 * 한줄 삭제 : ctrl + d
		 * 어절마다 이동? : ctrl + 방향키
		 */
		System.out.println("출력문 자동완성");
		System.out.println(1); //정수, 그냥 사용 가능.
		System.out.println("1"); //쌍따옴표 안은 문자열(String)이 됨
		//System.out.println(안녕하세요); 문자열이라 쌍따옴표 써야함.
		
		//자바의 출력문의 종류 - 3가지 제공 
		//1.개행문자 \n가 없는 출력
		System.out.print("곤니찌와\n"); //줄바꾸려면 + \n 하거나
		System.out.print("곤니찌와\n"); //system.out.println("곤니찌와"); <-하면된다.
		System.out.print("\n"); //<-개행 코드 
		//**\n은 메모장에서의 엔터라고 생각하며 찰떡.
		
		//2.개행문자를 마지막에 포함해주는 println
		System.out.println("니하오!"); //맨 뒤에 줄바꿈이 붙습니다.
		System.out.println("니하오!");
		
		//3.형식 지정 출력문 printf
		//내가 출력하고 싶은 문자열에 구멍을 뚫어놓고 사용하는 방식.
		/*
		 * %d - 정수 대입 o 
		 * %f - 실수 대입 o
		 * %s - 문자열 대입 o 
		 * 
		 * \n - 줄바꿈
		 * \t - 8칸 공백을 잡고 정렬
		 */
		System.out.println();
		System.out.printf("제 이름은 %s가 되고 싶습니다\n", "차은우");
		System.out.printf("제 나이는 %d 살 입니다\n", 3);
		System.out.printf("제 시력은 %f 입니다\n", 0.5);
		System.out.printf("제 시력은 %.1f 입니다\n", 0.5);
		System.out.printf("제 시력은 %.10f 입니다\n", 0.5);
		
		System.out.printf("우리가 사귄 날은 %d년 %d월 %d일 입니다.", 2015, 07, 31);
		System.out.println();
		System.out.printf("우리가 사귄 날은 \t%d년 %d월 %d일 입니다.", 2015, 07, 31);
		
		
	}
}
