package day08.modi.member.pac2;

import day08.modi.member.pac1.A;

public class C {

	//사용
	A a = new A(); //public o
//	A a2 = new A(1); //default x, 다른 패키지에서 사용 x
//	A a3 = new A("홍길동"); //private x, 다른 클래스,패키지에서 사용 x
	
	public C() {
		a.var1 = 1;
//		a.var2 = 2; //default x
//		a.var3 = 3; //private x
		
		
	}
	
	
	
	
	
	
	
	
}
