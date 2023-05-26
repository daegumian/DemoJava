package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	/*
	 * 
	ArrayList (일반적으로 많이 사용) lickedList와 비슷하다.
	가장 중요한 ArrayList!!!! 까먹으면 벽 보고 벌세운다
	A => 완전한 배열기반
    =>순서 o, 중복 o 
    =>탐색은 빠르다
	 */
	public static void main(String[] args) {
		
		//ArrayList<String> lis = new ArrayList<>();
		List<String> list = new ArrayList<>(); //이렇게 많이 사용.
		
		//list추가 add()
		list.add("고길동");
		list.add("둘리");
		list.add("도우너");
		list.add("고길동");
		list.add("마이콜");
		
		//문자열로 확인
		System.out.println(list.toString());
		
		//길이 확인 size()
		System.out.println("리스트의 길이 : " + list.size());
		
		//값의 중간에 추가 add() 무조건 사용이됨!!
		list.add(0, "신노스케");
		System.out.println(list.toString());
		
		//값의 확인 get() 제거 되는게 아니다. 확인만 하는 것이다.
		String n = list.get(3);
		System.out.println(n);
		
		//값의 수정 set()
		list.set(4, "미사에");
		System.out.println(list.toString());
		
		//값의 제거 remove()
		list.remove(5);
		System.out.println(list.toString());
		list.add(5, "탄지로");
		System.out.println(list.toString());
		list.remove("도우너");
		System.out.println(list.toString());
		
		//값의 여부 contains()
		if(list.contains("탄지로")) {
			System.out.println("!!!탄지로 있움!!!");
		}
		
		
		//빈 리스트 확인 isEmpty()
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
		}else {
			System.out.println("리스트가 비어있지 않음요");
		}
		
		//전부 삭제! clear()
		//list.clear();
		System.out.println(list.toString());
		
		System.out.println("----------------------------------------");
		
		// 제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음.
		// 제네릭<? extends String> = String과 String의 자식들 전달가능
		// 제네릭<? super String> = String타입이 될 수 있다면 전달가능
		
		List<String> list2 = Arrays.asList("a", "b", "c", "d"); //Arrays.asList는 바로 배열을 만들어줌
		System.out.println(list2.toString());
		
		
		//리스트를 병합, 맨 끝에 (데이터를)합쳐줌
		list.addAll(list2);
		System.out.println(list.toString());
		/*
				[고길동, 둘리, 도우너, 고길동, 마이콜]
				리스트의 길이 : 5
				[신노스케, 고길동, 둘리, 도우너, 고길동, 마이콜]
				도우너
				[신노스케, 고길동, 둘리, 도우너, 미사에, 마이콜]
				[신노스케, 고길동, 둘리, 도우너, 미사에]
				[신노스케, 고길동, 둘리, 도우너, 미사에, 탄지로]
				[신노스케, 고길동, 둘리, 미사에, 탄지로]
				!!!탄지로 있움!!!
				리스트가 비어있지 않음요
				[신노스케, 고길동, 둘리, 미사에, 탄지로]
				----------------------------------------
				[a, b, c, d]
				[신노스케, 고길동, 둘리, 미사에, 탄지로, a, b, c, d]
		*/
		
		
	}
	
	

}
