package quiz03;

public class DmbPhone extends Phone  {
	//DmbPhone은 Phone클래스를 상속 받습니다.
	//channel 변수를 생성하고, color, model, channel을 초기화 하는 생성자를 작성하세요.
	//메인메서드가 정상적으로 실행되도록 메서드를 추가하세요.
		
//	String model; //상속을 받았기 때문에 필요없다.
//	String color; //상속을 받았기 때문에 필요없다.
	
	int channel;
	
	/*
	 * DmbPhone(){ //기본 생성자 만들면 좋다.
	 * }
	 */
	
	
	DmbPhone(String a, String b, int c ){
		model = a; //상속을 받았기 때문에 사용할 수 있다.
		color = b; //상속을 받았기 때문에 사용할 수 있다.
		channel = c;
	}
	
	void turnOnDmb() { //반환 없어도 된다.
		System.out.println("TV를 켭니다");
	}
	
	int changeChannel(int j) { //리턴 딱히 없어도 되는 패턴. 매개변수만 있어도 된다.
		System.out.println("변경된 채널은 : " + j + "번 입니다.");
		return j;
	}
	/*
	 * void changeChannel(int j {
	 * 		channel = ch;
	 * 		system.out.println(channel + "번 변경");
	 */
	
	void turnOffDmb() {
		System.out.println("TV를 끕니다");
	}
	
}
