package day13.generic.good;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	public static void main(String[] args) {
		/*
		LinkedList (비슷한 노드객체기반)
		=> 순서 o, 중복 o
		=> 노드객체 (양방향 연결리스트)
		=> 삽입과 복제가 좋다 but, 탐색은 느리다.
		삽입, 삭제는 ArrayList보다 좋으나, 탐색은 느리다.		
		*/
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//list와 기능은 동일합니다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//값 확인
		System.out.println(list.toString());
		
		//중간에 추가
		list.add(3,10); //3번 인덱스에 10 추가!
		System.out.println(list.toString());
		
		//값 얻기 get()
		int n = list.get(3);
		System.out.println("곧 삭제될 숫자 : " + n);

		//값 삭제 remove()
		list.remove(3);
		System.out.println(list.toString());
	
		//linklist는 queue의 기능을 구현하기 때문에 queue기능도 사용이 가능
		
		//맨 뒤에부터 넣음
		list.offer(10);
		System.out.println(list.toString());

		//앞에서부터 값을 뽑아냄, 값이 빠져나감.
		int r = list.poll();
		System.out.println(r);
		System.out.println(list.toString());
	}

}
