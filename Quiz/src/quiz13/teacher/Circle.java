package quiz13.teacher;

public class Circle extends Shape { //abstract를 붙이면 이것 또한 추성 메서드가 되어서 자식클래스 만들어 사용해야한다.

	private int radius;
	
	public Circle(String name, int radius) {
		super(name); //부모님과 자식은 항상 super()을 통해 연결되어 있다.
		this.radius = radius;

	
	}

	@Override
	public double getArea() {
		
		return radius*radius*Shape.PI;
	}

	
	/*
	 * 원은 radius변수를 가집니다.
	 * 원은 생성될 때 이름과, radius를 받을 수 있도록 생성자 선언.
	 * getArea() = 원의 너비를 구하도록 오버라이딩을 하라
	 * 
	 */
	
	
	
	
	
}
