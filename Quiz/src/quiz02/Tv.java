package quiz02;

public class Tv {
	
	//멤버 선언.
	
	String company = "LG"; //회사
	int channel; //채널
	boolean power; //전원
	
	/*	  
	 * 메서드
	 * changeChanner : int - 매개변수 x번을 받아서 변경, 채널을 리턴
	 * power : void - 켜져있으면 꺼지고, 꺼져있으면 켜지고 동작될 수 있도록 if !=
	 * 
	 */
	
	int changeChanner(int a) {	
		if(a>0) {
			System.out.println("채널  "+a+"번 으로 변경되었습니다.");
			return a;
		}else {
			System.out.println("채널 "+a + "번 은 없습니다.");
			return a;
		}
		//channel = a;
		//return channel
	
	}
	
	
	
	void power() {
		if(power == false) {
			System.out.println("TV 켰습니다.");
			power = true;
		}else {
			System.out.println("TV 껐습니다.");
			power = false;
		}
	}
	
}
