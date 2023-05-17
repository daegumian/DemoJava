package day10.static_.basic;

public class Calculator {
	
	/*
	 * 클래스 설계를 할 때 , 적절한 곳에 static을 붙이면 좋다.
	 * 
	 * 객체마다 다른값을 가져야 하면 일반변수,
	 * 객체마다 동일한 값을 가져야 하면 static변수!
	 * 
	 */
	
	private String color; 
	public static double pi = 3.14; // 고정값은 static으루! 바로 값을 주는 꿀, ex)도메인주소!
	
	/*
	 * 메서드.
	 * 일반멤버변수를 사용하는 메서드는 static이면 안된다!!! ex) getter,setter!!
	 * 
	 * 일반 멤버변수를 사용하지 않고,
	 * 외부에서 범용성있게 사용할 메서드는 static이면 좋다.
	 * 
	 */
	
	public void setColor(String color) {
		this.color = color;
		
	}
	
	public String getColor() {
		return color;
	}
	
	public static double circle(int r) {//일반변수를 안쓰는 메서드는 static이 붙는게 좋다. 객체 생성없이 바로 circle이란 메서드를 사용가능하기 때문!
		
		return r*r*Math.PI;
	}
	
	
	
	
}	
