package day02;

public class IfEx01 {

	public static void main(String[] args) {
		
		//Math.random
		//0~100
		int point = (int)(Math.random() * 101);
		
		//커트라인 60점
		System.out.println("너의 점수는?" + point+"점");
		if(point <= 60) {
			System.out.println("과락입니다.");
			System.out.println("U DIE.");
		} else {
			System.out.println("살았네요.");
			System.out.println("소리질러요.");
		}
		System.out.println("ㅋㅋㅋㅋ빠이");
	}
}
