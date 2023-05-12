package day01;

public class Operator03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if 뒤에 소괄호가 true면 if중괄호 실행, false면 else문 실행
		if(x!=0&++y==21) { //모두 true일 때.
			System.out.println("굿굿맨");
		} else {
			System.out.println("WTF");
			
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		System.out.println();
		
		if(x!=1&++y==21) { //모두 true일 때.
			System.out.println("굿굿맨");
		} else {
			System.out.println("WTF");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		System.out.println();
		
		if(x!=1|++y==21) { //하나만 true일 때.
			System.out.println("굿굿맨");
		} else {
			System.out.println("WTF");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		System.out.println();
		if(x!=1|++y==24) { //하나만 true일 때.
			System.out.println("굿굿맨");
		} else {
			System.out.println("WTF");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		System.out.println();
		
		if(x!=10|++y==21) { //하나만 true일 때.
			System.out.println("굿굿맨");
		} else {
			System.out.println("WTF");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		System.out.println("---------------------");
		
		x = 10; 
		y = 20;
		if(x!=10 && ++y == 21) {
			System.out.println("굿굿맨");
		} else {
			System.out.println("WTF");
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		System.out.println();
		
		if(x!=1 || ++y == 21) {
			System.out.println("굿굿맨");
		} else {
			System.out.println("WTF");
		}
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
	}
}
