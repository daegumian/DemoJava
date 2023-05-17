package day09.poly.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Person p = new Person("이순신", 20);
		
		Student s1 = new Student("홍길동", 20, "123123");
		Student s2 = new Student("홍길동", 30, "456456");
		Teacher t1 = new Teacher("박찬호",40,"야구");
		Teacher t2 = new Teacher("손흥민", 40, "축구");
		Employee e1 = new Employee("강감찬",50,"역사부");
		
		//Student[] arr = {s1, s2};//상속관계가 아니라서 t1을 student에 담을 수 없다
		//Teacher[] arr2 = {t1, t2};
		
		//부모타입을 활용한 배열의 다형성
		Person[] arr= {p, s1, s2, t1, t2, e1};//부모클래스 배열은 다 담을 수 있음. 형변환이 되어서 들어간 것임.
		
		for(Person person :arr) {
			System.out.println(person.info());
		}
		System.out.println();
		System.out.println();
		
		//House객체의 inHouse메서드를 실행
		//Person이지만 Person의 자식들이 다 들어가 있어서 사용 가능.
		House h = new House(); //하우스 객체만듦.
		h.inHouse(p);
		h.inHouse(s1);
		h.inHouse(s2);
		h.inHouse(t1);
		h.inHouse(t2);
		h.inHouse(e1);
		//다 사용가능.
		
		h.whoAreYou(p);
		h.whoAreYou(s1);
		h.whoAreYou(s2);
		h.whoAreYou(t1);
		h.whoAreYou(t2);
		h.whoAreYou(e1);
		h.whoAreYou(p);
		
		
		//메서드
		
		
		
		
		
		
		
		
		
		
	}
	
}
