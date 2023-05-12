package quiz05;

public class Calculator {

	int result;
	double pi = 3.14;;
		
//	Calculator(){생성자가 없어도 된다.
//		
//		result = 0;
//		
//	}
	
	void add(int a) {
		result += a;
		System.out.println(result);
	}
	
	void sub(int b) {
		if(result>0) {
			result -= b;
			System.out.println(result);			
		}else {
			System.out.println("-값입니다.");
		}
	}
	double circle(int c) {
		
		System.out.println(c*c*pi);
		return c*c*pi;
	}
}
