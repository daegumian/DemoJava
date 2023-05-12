package quiz10;

public class MainClass2 {
	
	public static void main(String[] args) {
		
		//문제 1번. 답
		 /*
		 * 1. 클래스 User를 생성하세요
		 * 2. 멤버변수 name: String ,  rrn : int, int age 를 선언후 은닉 처리합니다 (private 지정)
		 * 3. User 클래스에는 기본생성자, 모든 멤버변수를  초기화 하는 생성자  2개를 생성하세요.
		 * 4. main에서 User객체를  생성 후  
		 *    (홍길동, 123123, 20)을 저장 하고 값을 확인하세요.
		 */
		
//		User2 u1 = new User2();
//		u1.setAge(20);
//		u1.setRrn(123123);
//		u1.setName("홍길동");
	
		User2 u1 = new User2("홍길동", 123123,20);
		System.out.println("NAME : "+ u1.getName());
		System.out.println("AGE : "+ u1.getAge());
		System.out.println("RRN : "+ u1.getRrn());
		
		
		
		
		System.out.println("----------문제2----------");
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 456456, 30)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
 		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
 		 * ex) User[] arr = new User[2];
		 */
		
		User2 u2 = new User2("김길동", 456456, 30);
		User2[] arr = new User2[2]; //User객체 - 주소값(변수명)으로 저장.
		arr[0] = u1; //같은 User타입이라 데이터 쓰기 가능.
		arr[1] = u2; 
		
		for(User2 u : arr) {
//			System.out.println(u);//.(dot)은 그 주소까지 가라.
			System.out.println("==========================");
			System.out.println("향상된 for문으로!");
			System.out.println(u.getAge());
			System.out.println(u.getName());
			System.out.println(u.getRrn());
			System.out.println();
//		for (int i = 0; i < arr.length; i++) {
//				User2 k = arr[i];
//				System.out.println("==========================");
//				System.out.println("for문으로 정석 출력");
//				System.out.println(k.getAge());
//				System.out.println(k.getRrn());
//				System.out.println(k.getName());
//				System.out.println("==========================");
//				System.out.println("한번에 사용하기");
//				System.out.println(arr[i].getAge());
//				System.out.println(arr[i].getRrn());
//				System.out.println(arr[i].getName());
//		}	
			
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
