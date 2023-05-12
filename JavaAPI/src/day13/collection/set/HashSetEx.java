package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		/*
		 * Set 계열
		리스트와 반대 (순서 x, 중복 x)
		=> 인덱스 기준으로 조회하는 메서드가 없다.
		=> 동일한 값을 저장하면, 들어가지 않는다.
		set계열 순회할 때는 향상된 포문, 반복자 개념을 사용해야한다.

		HashSet 클래스 -> Hash란 뭔가를 구글링해보자
		TreeSet 클래스 (Set+정렬)

		 */
		
		//HashSet<Integer> set = new HashSet<>(); 밑에 것과 같다.
		Set<String> set = new HashSet<>(); 
		
		//add() //넣는 순으로 저장되진 않음. 랜덤하게 섞여 저장. 빼낼 때도 그럼.
		set.add("테슬라");
		set.add("숭구리당당");
		set.add("java");
		set.add("굴굴");
		set.add("룰루랄라");
		set.add("테슬라"); // 중복 x
		
		//
		System.out.println(set.toString());//무작위 저장 
		
//		set.get(인덱스) : why 안되는가? 인덱스가 없기 때문에, 무작위로 저장되기 때문에!
		
		//크기
		System.out.println("크기 : " + set.size());//5 중복되지 않기에!
		
		//삭제(값)
		set.remove("굴굴");
		System.out.println(set.toString());//테슬라 숭구리당당 java 룰루랄라
		
		//순회 => 내부적으로 반복자(Iterator=순서없는 요소들을 반복할때)의 개념을 사용해서 회전, 향상된 for문!
		//비슷한 개념은 tokenizer
		
		//방법1
		for(String s : set) {
			System.out.println(s);//테슬라 숭구리당당 java 룰루랄라
		}
		
		System.out.println("--------");
		
		//방법2
		//set => iterator 타입으로 변경 [무작위 바구니 속 원소들을 -> 정렬된 형태로 저장]
		Iterator<String> iter = set.iterator(); 
		
		while(iter.hasNext()) {	//hasNext : 다음이 있다면 true.
			System.out.println(iter.next()); //테슬라 숭구리당당 java 룰루랄라
		}
	}

}
