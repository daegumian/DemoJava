package day02;

public class EnhanceForEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		//향상된 포문 - 배열같은 연속된 타입을 돌리기에 적합
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("----------");
		
		String[] arr2 = {"가","나","다","라","마","사"};
		
		for(String b : arr2) {
			
			System.out.println(b);
		}
		
		System.out.println("------------");
		
		//이 값들의 합계와 평균(실수형)을 
		int[] score = {50,40,30,20,10};
		
		int sum = 0;
		double ave = 0;
		int count = 0;
		for(int a : score) {
		sum += a;
		count ++;
		}
		ave = (double)sum/count;
		
		System.out.println(sum);
		System.out.println(ave);
		System.out.println((double)sum/score.length); //캐스팅 + 배열의 길이 복습!
		//int / int = int, double/intt = double, byte/byte=int 캐스팅
	
	}
	
}
