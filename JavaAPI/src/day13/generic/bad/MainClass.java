package day13.generic.bad;

public class MainClass {
	
	public static void main(String[] args) {
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만,
		 * 그 값을 사용할 때, 알맞은 타입으로 반드시 형변환을 해야 합니다.
		 * 
		 * 잘못 형변환하면, 예외가 발생한다.
		 * 
		 */
		
		ABC abc = new ABC(); //만능 Object ABC!!!!
		abc.setObj("고길동");
		
		String name = (String)abc.getObj();
		System.out.println(name);
		
		ABC abc2 = new ABC();
		abc2.setObj(new Person()); //한번에 person을 만들어서 abc2에 저장
		Person p = (Person)abc2.getObj();
		
	}

}
