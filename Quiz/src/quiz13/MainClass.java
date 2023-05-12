package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Circle c = new Circle("원", 5);
		System.out.println("원 넓이 : "+c.getArea());
		System.out.println(c.getName());
		
		Shape r = new Rect("정사각형", 5); //부모로 만들어도 자식클래스에서 오버라이드된 메서드가 최우선 나오기 때문에 출력에 아무 상관 없다!!
		System.out.println("정사각형 넓이 : " + r.getArea());
		System.out.println(r.getName());
	}
	
	
}
