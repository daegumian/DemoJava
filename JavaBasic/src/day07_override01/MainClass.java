package day07_override01;

public class MainClass {

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.method01(); //본인의 메서드
		parent.method02(); //본인의 메서드
		
		
		Child child = new Child();
		child.method01(); //상속받은 메서드
		child.method02(); //오버라이드 된 메서드 실행.
		
		
	}
}
