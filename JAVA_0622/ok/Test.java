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
			System.out.println(user.type +" "+ user.name + "��(��) �������� �̿��մϴ�.");

		}

		public static void main(String[] args) {
			Test tt = new Test();			
			User user = new Student("ȫ�浿","�л�");
			tt.useLibrary(user); 
			
			Student stu01 = new Student("ȫȫȫ","�����ֹ�");	// Student s1 = new Student();
			tt.useLibrary(stu01);	//�̷��� �ϴ°ͺ��� user�� �ϴ°� �ξ� ����ϴ�
			
			User user1 = new Staff("�Ӳ���","������");		
			tt.useLibrary(user1);	
		}

	}
