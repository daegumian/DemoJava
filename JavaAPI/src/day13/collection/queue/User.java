package day13.collection.queue;

public class User implements Comparable<User> {
	
	private String name;
	private int age;
	
	//생성자
	
	public User() {
		
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(User o) { //compareTo메서드를 오버라이딩 해서 사용해야된다.
		//내꺼와 매개변수로 들어오는 User객체의 멤버변수 값의 비교
		
//		return this.name.compareTo(o.getName());//오름차순 내꺼 기준으로 적었을 때 오름차순
//		return o.getName().compareTo(this.name);//내림차순 내께 기준이 아닐 때는 내림차순
//		return Integer.compare(this.age, o.getAge()); //나이 오름차순
		return Integer.compare(o.getAge(), this.age); //나이 내림차순
		
	}

	

}
