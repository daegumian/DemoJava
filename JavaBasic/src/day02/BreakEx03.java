package day02;

public class BreakEx03 {

	public static void main(String[] args) {

		//변수를 사용하는 방법
		/*
		boolean flag = false; //탈출을 위한 변수 고전전 방법.


		for(char c = 'A'; c <= 'Z'; c++) {
			for(char l = 'a'; l <='z'; l++) {

				System.out.println(c + "-" + l);
				if(l == 'f') {
					flag = true; //탈출을 위해 true :실행했다 안했다 했다 안했다 판단할 때 사용.
					break; 
				}
			}//end
			if(flag)break;

		}
		 */
		//라벨 방식!
		
		x:for(char c = 'A'; c <= 'Z'; c++) { // x: <- 이름 붙이기.
			for(char l = 'a'; l <='z'; l++) {

				System.out.println(c + "-" + l);
				if(l=='f') {
					break x; //표시까지 완전히 탈출 하라.
				}
				
				
			}
		}
	}


}
