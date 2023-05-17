package day06.import_ex;

//import day06.fruit.Apple; //패키지르명을 포함한 클래명
//import day06.fruit.Melon; //ctrl + space 추천해줌~ 그리고 엔터~
import day06.fruit.*; //+'*'하면 해당 패키지 않에 있는거 다 사용할 수 있움!

public class MainClass {

	public static void main(String[] args) {

		Apple app = new Apple();
		Melon mel = new Melon();
		
		int a = 1;
		System.out.println(a);
		System.out.println(mel); //힙메모리에 저장된 주소값이 나옴
		System.out.println(app); //힙메모리에 저장된 주소값이 나옴
		
			
	}

}
