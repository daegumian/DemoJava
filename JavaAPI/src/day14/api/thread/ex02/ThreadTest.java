package day14.api.thread.ex02;

public class ThreadTest implements Runnable {

	private int num = 0;

	@Override
	public synchronized void run() { 
		//synchronized를 붙이면 첫번째것을 먼저 실행 다 시킨후 다음 것 실행.
		
		for (int i = 1; i <= 10; i++) {
			
			num++;
			
			System.out.println("============================================");
			System.out.println("쓰레드명 : " + Thread.currentThread().getName()); //현재의 쓰레드 값 반환
			System.out.println(num);
			try {
				Thread.sleep(1000);//1초
			} catch (Exception e) {
			}
			
			
		}
		
		
	}
	
}

