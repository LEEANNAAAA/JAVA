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
		Person p = new Student("���繮");

		System.out.println(p.name);
		
		Student s1 = (Student) p;	//���� �� ��ȯ
		s1.grade = "A";
		s1.department = "Com";
		
//		p.grade = "A";	>����
//		p.department = "Com";	>����
		
		System.out.println(s1.grade);
		System.out.println(s1.department);
	}
}
