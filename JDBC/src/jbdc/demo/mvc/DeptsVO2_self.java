package jbdc.demo.mvc;

public class DeptsVO2_self{

	//데이터베이스의 컬럼값을 가지고 다닐 클래스
	//만드는 규칙
	//1. 데이터베이스 컬럼을 멤버변수로 선언, 은닉합니다.
	//2. 생성자는 2개를 만듭니다.
	//3. getter, setter를 활용합니다.
	

	private int department_id;
	private String dapartment_name;
	private int manager_id;
	private int location_id;
	
	//생성자 , alt shift s
	public DeptsVO2_self() {
		
	}
	
	public DeptsVO2_self(int department_id, String dapartment_name, int manager_id, int location_id) {
		super();
		this.department_id = department_id;
		this.dapartment_name = dapartment_name;
		this.manager_id = manager_id;
		this.location_id = location_id;
	}
	
	//getter, setter 
	
	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDapartment_name() {
		return dapartment_name;
	}

	public void setDapartment_name(String dapartment_name) {
		this.dapartment_name = dapartment_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	
	
	
	
	
}
