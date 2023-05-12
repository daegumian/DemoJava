package day11.inter.basic3;

public class MainClass {

	public static void main(String[] args) {
		
//		LG pt = new LG(); //new Samsung(); //그냥 LG로 실행하면 그냥 LG를 바로 실행한다
		Printed pt = new LG(); //new Samsung(); //interface로 실행하면 interface타입을 기고 호출한다.
		
		
		pt.print("hello, wolrd");
		pt.colorPrint("hello, world2", "자주색");
		int result = pt.copy(5);
		
	}
}
