package quiz13.teacher;

public class Rect extends Shape {

	private int side;
	public Rect(String name, int side) {
		super(name); //부모님께 던져주기. super는 무조건 첫째줄에!!!!!
		this.side = side; //
	}
	
	public double getArea() {
		return side*side;
	}
	
	
	
	/*
	 * 정사각형은 side변수를 가집니다.
	 * 정사각형원은 생성될 때 이름과, side를 받을 수 있도록 생성자 선언.
	 * getArea() = 사각형의 너비를 구하도록 오버라이딩을 하라
	 * 
	 */
	
}
