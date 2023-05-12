package day08.super_;

public class Child extends Parent {
	
	

	//아무것도 안적어도 아래 것이 생략되어 생성되어 있다..
	//child(){
	//super();
	//}
	
	String me;

	//현재 부모클래스의 기본 생성자가 없어서 엑박이 뜬다. 해결 방법은 2가지가 있다
	//1. 부모님의 기본생성자를 만든다. <- 사실 올바르지 않는 방법. 되긴함. 그러나 
	//2. 자식에서 super()를 통해서 부모님의 생성자와 강제연결한다. //
	
	
	
	Child(String me){
//		super(); //부모님의 기본 생성자 저장.
		super("나문희", "이순재");//부모님 father, mother로 강제 연결됨.
		
		this.me = me; // -> String me에 감.
		
	}
}
