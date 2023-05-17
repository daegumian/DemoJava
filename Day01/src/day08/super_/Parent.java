package day08.super_;

public class Parent extends Object { //모든건 Object 클래스를 부모로...

	String mother;
	String father;
	
	//아무것도 생성하지 않아도
//	Parent(){
//		super();
//	}
	Parent(String mother, String father){
		
		this.mother = mother;
		this.father = father;
		
	}

	String info() {
		return "name : " + mother + ", father : " + father;
	}
	
	
	
	
	
}
