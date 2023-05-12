package quiz07;

public class MainClass {

	public static void main(String[] args) {
		
		Car car = new Car("애스턴 마틴");
		car.accel(160);
		car.accel(20);
		System.out.println("====================");
		car.run();
		
	}
}
