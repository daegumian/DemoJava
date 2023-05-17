package day08.encap.obj;

public class Hotel {
	
//	private String name; //String도 클래스!
//	private Chef chef = new Chef();	//Chef도 클래스!chef는 변수명
	//chef에 초깃값을 주는 방법
	
	private Chef chef;
	

	//호텔은 생성될 때 외부에서 chef객체를 받는다.
	//	public Hotel() {
//		this.chef = new Chef(); // Hotel클래스가 만들어지면 자동으로 생성.
//	}
	
	
	//호텔을 생성될 때 외부에서 chef객체를 받는다.
	public Hotel(Chef chef) {
		this.chef = chef;
	}

	//stter
	public void setChef(Chef chef) {//String name이랑 개념 독같다
		this.chef = chef;
		
	}
	
	//getter 
	public Chef getChef() {//헷갈리면 String이라고 생각해라.
		return chef;
	}
	
	
	
	
	
	

}