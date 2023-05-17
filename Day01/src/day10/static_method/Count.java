package day10.static_method;

public class Count {
	public int a; //껍데기 상태.
	public static int b; //이건 만들어져 있음.
	
	//일반 메서드 - 일반 멤버와, 정적멤버 모두 사용 가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	//정적 메서드 - 일반멤버는 바로 사용할 수 없음, 정적 멤버는 사용 가능.
	 //			단,직접 객체 생성을 통해서는 가능!
	public static int method02() {
		
//		a = 10;	사용이 안되는 이윤 - ststic이 생성될 당시에 a 변수는 없다. //a변수는 객체로 뽑혀야 쓸 수 있으니.
		Count c = new Count();// //직접 객체 생성을 통해서는 가능!
		c.a = 10; 
		b++;
		return b;
		
		
	}
	
	
	
}	
