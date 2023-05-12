package quiz05;

public class Computer extends Calculator{
	
	
	double circle(int c) {// 이게 실행됨. 오버라이딩 되어서.
		
		return c*c*Math.PI;
	}

	double rect(double a) {
		System.out.println(a*a);
		return a*a;
	}
	double rect(double a, double b) {
		System.out.println(a*b);
		return a*b;
	}
	double rect(double a, double b, double c) {
		System.out.println(a*b*c);
		return a*a*a;
	}
	
}
