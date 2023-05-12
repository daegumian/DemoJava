package day13.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	public static void main(String[] args) {
		/*
		 * 
		Priority (우선순위 큐)
		=>정렬기능을 포함
		=>PriorityQueue클래스가 구현함
		 * 
		 */
		
		Queue<Integer> que = new PriorityQueue<>();
		
		que.offer(4);
		que.offer(3);
		que.offer(1);
		que.offer(5);
		que.offer(6);
		
		System.out.println(que.toString());//[1,3,4,5,6]
		
		//작은 순서대로 나옴. 나옴과 동시에 삭제
		System.out.println(que.poll()); // 1
		System.out.println(que.poll()); // 3
		System.out.println(que.poll()); // 4
		System.out.println(que.poll()); // 5
		System.out.println(que.poll()); // 6
		System.out.println(que.toString());//[]
		
		System.out.println("---------------------------------------");
		
		//User객체를 담을 수 있는 큐
		//큐가 순서를 확인할 때 compareTo 메서드를 확인함.
		//compareTo에 정의된 순서에 의해 우선순위를 정한다.
		//객체가 우선순위를 가지게 하려면
		//comparable인터페이스를 상속받아서 comparTo메서드를 오버라이딩해서 사용해야한다.
		
		//우선순위 지정
		System.out.println("홍길동".compareTo("홍길자")); //홍길동이 사전적으로 앞에 위치 -> 음수 "홍길동"이 기준 //음수
		System.out.println("홍길자".compareTo("홍길동")); //홍길자가 사전적으로 뒤에 위치 -> 양수 "홍길자"가 기준 //양수
		
		
		Queue<User> queue = new PriorityQueue<>(); //들어가는 순서대로 저장 First In Last Out
		
		queue.offer( new User("홍길동", 10)); //User객체 바로 집어넣기
		queue.offer( new User("홍길자", 20)); //User객체 바로 집어넣기
		queue.offer( new User("홍길순", 30)); //User객체 바로 집어넣기
		queue.offer( new User("신사임당", 40)); //User객체 바로 집어넣기
		
		System.out.println(queue.toString());
		//[User [name=신사임당, age=40], User [name=홍길순, age=30], User [name=홍길자, age=20], User [name=홍길동, age=10]]
		System.out.println(queue.poll().getName());//신사임당
		System.out.println(queue.poll().getName());//홍길순
		System.out.println(queue.poll().getName());//홍길자
		System.out.println(queue.poll().getName());//홍길동
	}
}
