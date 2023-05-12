package quiz13.teacher;

public class MainClass {

	public static void main(String[] args) {

		Circle circle = new Circle("원", 4);
		System.out.println(circle.getArea());
		System.out.println(circle.getName());
		
		Shape rect = new Rect("정사각형", 4); //부모로 만들어도 자식클래스에서 오버라이드된 메서드가 최우선 나오기 때문에 출력에 아무 상관 없다!!
		System.out.println(rect.getArea());
		System.out.println(rect.getName());
		
		
		
		
	}


}
