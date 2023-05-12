package quiz11;

public class MainClass {
	
	public static void main(String[] args) {
		
		
		
		// 뭘 해야할지 모르겠으면 객체를 우선 만들어라.
//		//객체를 만들기
//		KeyBoard k = new KeyBoard();
//		Mouse m = new Mouse();
//		Monitor n = new Monitor();
//		Computer com = new Computer(k, m , n);
		
		//합친버전
		Computer com = new Computer(new KeyBoard(), new Mouse(), new Monitor());
		com.computerInfo();
		System.out.println();

		//get
//		com.getMonitor().info();
		Monitor m = com.getMonitor();
		m.info(); //점을 잘찍자.
		
		
		
		
	}
	

}
