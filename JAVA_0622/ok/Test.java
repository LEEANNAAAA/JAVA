package ok;

	class User {

		String name;
		String type;
		
		public User(String name,String type) {
			this.name = name;
			this.type = type;
		}
	}

	class Student extends User {
		public Student(String name,String type) {
			super(name, type);
		}
	}

	class Staff extends User {
		public Staff(String name,String type) {
			super(name, type);
		}
	}

	class Citizen extends User {
		public Citizen(String name,String type) {
			super(name, type);
		}
	}

	public class Test {

		public void useLibrary(User user) {
			System.out.println(user.type +" "+ user.name + "이(가) 도서관을 이용합니다.");

		}

		public static void main(String[] args) {
			Test tt = new Test();			
			User user = new Student("홍길동","학생");
			tt.useLibrary(user); 
			
			Student stu01 = new Student("홍홍홍","지역주민");	// Student s1 = new Student();
			tt.useLibrary(stu01);	//이렇게 하는것보다 user로 하는게 훨씬 깔끔하다
			
			User user1 = new Staff("임꺽정","교직원");		
			tt.useLibrary(user1);	
		}

	}
