package day01;

public class VariableScope {

		public static void main(String[] args) {
			
		 //변수는 중괄호 안에서 선언, 안에서만 유효.
			
//		int park1 = 10;
//		int park2 = 20;
		int park1 = 10, park2 = 20;
		int park4 = 0; //변수의 선언부
			
		if(true) {
			int park3 = park1 + park2; //30
		
			//여기에서 park3의 값을 변경, 
			//바깥에서 사용하고픔 => 변수를 바깥에서 선언하고, 안쪽에서 초기화를 맘껏 해주면된다.
			park4 = 1000;
			
			
		}
		int park3 = 100; //park3은 if 문장을 벗어나서 사라졌기 때문, 동일 이름 선언가능
		System.out.println(park3);
		
		System.out.println(park4);
	}
}
