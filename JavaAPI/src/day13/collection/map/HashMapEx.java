package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//Map인터페이스를 구현하는 클래스 HashMap
		//두 개의 매개값을 입력할 수 있는 멀티 제네릭
		//Map과 list는 까먹으면 안된다
		//탐색이 빠르다. key값만 알면!
		//put과 get만 제대로 활용해도 Map클래스를 잘 쓰는 것이다.
		
		//key에 대한 타입과 val에 대한 타입을 지정
		//아래 두 개는 같다. Map인터페이스에서 상속 받은 것이기 때문에
		//HashMap<Integer, String> map = new HashMap<>(); 
		Map<Integer, String> map = new HashMap<>(); //주로 이렇게 많이 사용함.
		
		//Map에 값을 저장 put(키, 값)
		
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		
		//문자열로 맵의 결과 출력 //배열 구조가 아님.tree 형식.
		//값은 중복 허용. but, key는 중복 x
		System.out.println(map.toString());// [홍길동, 이순신, 홍길자, 홍길동, 신사임당]
		System.out.println(map.size()); // 5
		
		//동일한 키를 저장하면? //값이 변경된다. -> key만 알면 모든게 해결 가능허다.
		map.put(4, "강감찬");
		System.out.println(map.toString()); // [홍길동, 이순신, 홍길자, 강감찬, 신사임당]
		
		//Map의 값을 얻기 get(키) : 값을 반환
		String item = map.get(3);
		System.out.println(item); // 강감찬
		
		//key의 유무확인 containsKey(키),containsValue(밸류)
		
		if(map.containsKey(3)) {
			System.out.println("3번 키가 존재함"); // 3번 키가 존재함
		}
		if(map.containsValue("홍길동")) {
			System.out.println("홍길동이 존재함"); // 홍길동이 존재함
		}
		
		//Map의 삭제 remove(키)
		map.remove(4);
		System.out.println(map.toString()); //{1=홍길동, 2=이순신, 3=홍길자, 5=신사임당}
		
		//Map의 순회
		//엔트리에는 키, 값을 꺼내는 기능
		
		//방법1 -> 추가적으로, Set과 Entry 둘 다 import 해야함.
		//Map의 entrySet()메서드 사용.
		Set<Entry<Integer, String>> entryset = map.entrySet(); //Map을 => Set으로 변경
		for(Entry<Integer, String> entry : entryset){
			System.out.println(entry);
			/*
			 1=홍길동
			 2=이순신
			 3=홍길자
			 5=신사임당
			 */
		}
		
		System.out.println("-------------");
		
		//방법2 -> 추가적으로, Set만 import 하면됨.
		//Map의 keySet()메서드 사용.
		Set<Integer> set = map.keySet(); //키만 꺼내서 set에 저장
		for(int key : set) {
			System.out.print(key);
			System.out.println(map.get(key));
			/*
			 1홍길동
			 2이순신
			 3홍길자
			 5신사임당
			 */
		}
		
		System.out.println("-------------------------");
		
		//Map에 객체를 담는 모형 - value에 넣으면 된다.
		//Map<Integer, 유저> map2 = new HashMap<>();
		Map<Integer, Object> map2 = new HashMap<>();
	}
}
