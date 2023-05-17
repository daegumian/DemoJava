package day05;

public class PenMain {

	public static void main(String[] args) { //사용할 곳은 메인을 꼭 넣어야 한다.
		
		//팬을 사용하려면 객체로 생성 해야 합니다.
		Pen red = new Pen();
		red.ink = "검은색 ";
		red.price = 1000;
		red.company = "Samsung";
		red.info();
		red.write();
		
		Pen blue = new Pen();
		blue.ink = "파랑색";
		blue.price = 1500;
		blue.company = "Apple";
		blue.info();
		blue.write();
		
		
	}
	
	
}
