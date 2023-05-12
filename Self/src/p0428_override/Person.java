package p0428_override;

public class Person extends Object{

	//모든 클래스는 Object를 상속받습니다.

	private String name;


	public Person() {
	}


	public Person(String name) {

		this.name = name;//

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	//오버라이드
	//모형대로 만들면된다. 
	//alt + shift + s -> override impl~~~
	//equals메서드 객체의 name변수가 같다면 true반환 하도록 오버라이딩해보기
	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}



	
	



}
