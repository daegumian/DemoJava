package day14.api.thread;

public class MainClass {
	
	public static void main(String[] args) {
		
		//1. 작업쓰레드로 사용할 객체생성
		ThreadTest test = new ThreadTest();
		
		//2. 쓰레드 클래스를 사용해서 작업쓰레드를 실행
		Thread thread = new Thread(test, "Tread_A");
		
		thread.start();
		
		try {
			thread.sleep(5000);//5초간 멈춤
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");
		
	}

}
