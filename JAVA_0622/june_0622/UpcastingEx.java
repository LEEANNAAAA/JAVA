package june_0622;

class Person {
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	String department;
	
	public Student (String name) {
		super(name);
	}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
public class UpcastingEx{
	public static void main(String[] args) {
		Person p = new Student("이재문");

		System.out.println(p.name);
		
		Student s1 = (Student) p;	//강제 형 변환
		s1.grade = "A";
		s1.department = "Com";
		
//		p.grade = "A";	>오류
//		p.department = "Com";	>오류
		
		System.out.println(s1.grade);
		System.out.println(s1.department);
	}
}
