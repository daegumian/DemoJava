package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {
		
		//사용하는 곳(생성하는 곳)
		Chef c = new Chef();
		Hotel h = new Hotel(c);
//		Hotel h = new Hotel(new Chef()); 
		//객체를 생성자로 받는구나.//변수로 객체를 준다. //위 방법과 같은 방법. //new Hotel은 객체.
		
		Chef chef = h.getChef(); //반환유형 보는 습관 가지기. (맨 앞에 것이 반환타입.)
		System.out.println(c==chef); //true
		chef.cooking(); //chef한에 들어있는 기능. 접근할 수 있음.
		
	
		
	}
}
