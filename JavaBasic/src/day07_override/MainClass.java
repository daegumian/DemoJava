package day07_override;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 20;
		s.name = "박동훈";
		s.studentId = "123456";
		System.out.println(s.info());
		
		
		Teacher t = new Teacher();
		t.age = 100;
		t.name = "한성대";
		t.subject = "과학";
		System.out.println(t.info());
		
		
		Employee e = new Employee();
		e.age = 120;
		e.name = "윤귀순";
		e.department = "행정부";
		System.out.println(e.info());
		
	}
	
}
