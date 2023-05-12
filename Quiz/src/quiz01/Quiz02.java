package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1~100까지의 랜덤한 정수를 생성
		System.out.println(Math.random());
		double a = Math.random();
		System.out.print("1~100까지의 랜덤한 정수 :"); //출력만 한거임
		System.out.printf("%.0f", a*100);	
		System.out.println();
		System.out.println(a);// 이게 소수점이 나오니깐 삼항식이 틀림.
		//출력된 수를 a로 가져가는 방법은?
		
		
		
		//랜덤하게 나온수가 3의 배수인지, 3의 배수가 아닌지 3항연산식으로 결과 출력.
		System.out.println();
		String k = a % 3 == 0 ? "3의 배수 맞음" : "3의 배수 아님"; //이건 맞음.
		System.out.println(k);
		System.out.println();
		System.out.println("------------------------------");
		
		//정답
		
		int i = (int)(Math.random()*100);
		System.out.print("1~100까지의 랜덤한 정수:");
		System.out.println(i);
		
		String result = i%3==0?"3의 배수 맞음" : "3의 배수 아님";
		System.out.println(i + "는" + result);	
		System.out.println("-------------------------");
		
		//선생님이 알려준 예제 
		
//		double i1 = Math.random()*100;
//		int b = (int) i1;
//		String result = b%3==0?"3의배수 맞음" : "3의배수 아님";
//		System.out.println(b + "는 " + result);
//		
		//조건식 ? 연산1 : 연산2
//		
		
	}
}
