package day10.static_.field;

public class MainClass {

	public static void main(String[] args) {
		
//		Count c1 = new Count();
//		c1.a++;
//		c1.b++;
//		
//		System.out.println("c1의 a:" + c1.a);//객체들 마다 각각 값을 가지고 있음//1
//		System.out.println("c1의 b:" + c1.b);//밖에 1개 만들어져. 계속 축적 //1
//		
//		Count c2 = new Count();
//		c2.a++;
//		c2.b++;
//		
//		System.out.println("c2의 a :"+ c2.a);//객체들 마다 각각 값을 가지고 있음 //1
//		System.out.println("c2의 b :" +c2.b);//밖에 1개 만들어져. 계속 축적 //2
//		
//		Count c3 = new Count();
//		c3.a++;
//		c3.b++;
//		System.out.println("c3의 a :" + c3.a);//객체들 마다 각각 값을 가지고 있음 //1
//		System.out.println("c3의 a :" + c3.b);//밖에 1개 만들어져. 계속 축적 //3
//		
//		//현재 c1.b 는 몇일까요?
////		System.out.println(c1.b); // 3
		System.out.println("------------------------------------------");
		/*
		 * static은 클래스 밖에 1개가 생성이 되기 때문에
		 * 
		 * 객체 생성없이 클래스이름.변수명.
		 */
		Count.b++;
		System.out.println(Count.b);
		Count.b = 100;
		System.out.println(Count.b);
		
		//c2의 b는 몇일까? //100
		
	}
	
}
