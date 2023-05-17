package day06.inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 20;
		s.name = "박동훈";
		s.studentId = "parkpark";
		System.out.println(s.info());
		System.out.println(s.studentId);
		
		Teacher t = new Teacher();
		t.age = 100;
		t.name = "한성대";
		t.subject = "과학";
		System.out.println(t.info());
		System.out.println(t.subject);
		
		Employee e = new Employee();
		e.age = 120;
		e.name = "윤귀순";
		e.department = "교장";
		System.out.println(e.info());
		System.out.println(e.department);
	}
	
}
