package quiz19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListQuiz01 {
	public static void main(String[] args) {

		/*
		 * List 2번
		 * 
		 * 1. list에 1~20까지 값을 순서대로 저장
		 * 
		 * 2. list에 값을 순서대로 출력.
		 * 
		 */

		/*
		 * List2번
		 * 
		 * 1. User를 저장하는  list생성
		 * 2. 3개의 각각 다른 User 객체를 만들고 순서대로 저장
		 * 3. User 객체 안에 홍길동 이 있으면 해당 객체의 name, age를 출력하는 코드
		 * 4. User 객체 안에 홍길자 가 있으면 해당 객체를 삭제 코드
		 * 
		 */

		//1번

		List<Integer> list1 = new ArrayList<>();

		for(int i = 1; i < 21; i++) {
			list1.add(i);
		}
		System.out.println(list1.toString());


		//2.

		List<User> list2 = new ArrayList<>();

		User user1 = new User("홍길동", 20);
		User user2 = new User("홍길자", 21);
		User user3 = new User("고길동", 22);

		list2.add(user1);
		list2.add(user2);
		list2.add(user3);


		for (int i = 0; i < list2.size(); i++) {

			if(list2.get(i).getName().equals("홍길동")) {
				System.out.print(list2.get(0).getName()+", ");
				System.out.println(list2.get(0).getAge());
			}

			if(list2.get(i).getName().equals("홍길자")) {
				list2.remove(i);
			}
		}

		for (User k : list2) {
			System.out.print(k.getName());
			System.out.print(", ");
			System.out.print(k.getAge()+ " ");
		}






	}

}
