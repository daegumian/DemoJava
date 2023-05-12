package quiz01;

public class Quiz12 {

	public static void main(String[] args) {
		
		//1000까지 정수 중에서 : 1 <= a <= 1000
		//4의 배수이면서, : a % 4 == 0
		//8의 배수가 아닌 수의 : a % 8 != 0 
		//count(개수) :  
		int a = 1;
		int count = 0;
		while(a<=1000) {
			
			if((a%4==0)&&(a%8!=0)) { //통과하면 1씩증가
			count ++; 
			}
			a++;
		}
		System.out.println(count);
		
		//50~100까지의 합
		
		int sum = 0;
		int i = 50;
		while(i<=100) {
			sum += i;
		i++;
		}System.out.println(sum);
		
	}
	
}
