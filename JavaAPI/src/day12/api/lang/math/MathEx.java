package day12.api.lang.math;

public class MathEx {
	
	public static void main(String[] args) {
		
		int r = (int)(Math.random()*10)+1; //1~10
		System.out.println(r); 
		
		double d = Math.abs(-3.14); //절댓값 
		System.out.println(d); //3.14
		
		double d2 = Math.ceil(3.14); //올림
		System.out.println(d2); //4.0
		
		double d3 = Math.floor(3.14);//내림
		System.out.println(d3); //3.0
		
		double d4 = Math.round(3.14);//반올림
		System.out.println(d4);//3.0
		
		int d5 = Math.max(3, 5); //큰수 반환
		System.out.println(d5);//5
		
		
		Object[] arr = {1,2,3}; //1,2,3은 기본타입인데 Object의 배열에 들어간다? 
		
		
	}

}
