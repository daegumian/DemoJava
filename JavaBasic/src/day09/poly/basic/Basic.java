package day09.poly.basic;

/*
 * 하나의 자바파일에는 여러 클래스 선언이 된다.
 * 단, 파일명과 동일한 클래스가 있어야하고, 해당 클래스만 public이면 된다.
 */
class A {}
class B extends A {}
class C extends A {} 
class D extends B {}
class E extends C {}



public class Basic {
	
	//선언해주는 문장은 가능, 값 변경은 x -> a = new A();(X)
	A a = new A();
	B b = new B();
	C c = new C();
	B d = new D();
	E e = new E();
	
	A a1 = b; //(=new B)
	A a2 = c;
	A a3 = d;
	A a4 = e;
	
	//줄여 쓰면
	A a5 = new B(); //B -> A 변환
	
	//기본타입변수
	int x = 1;
	double y = x; //int -> double 변환
	
	
	//Object타입 모든 클래스가 저장 가능.
	Object o1 = a;
	Object o2 = "문자열";
	Object o3 = 2;
	Object o4 = new B();
	
	
	
	
	
	
	
	
	
	
	
	
	

}
