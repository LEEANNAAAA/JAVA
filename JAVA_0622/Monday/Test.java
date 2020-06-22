package Monday;

class User {

	String name;

	String type;

	public User() {

	}

	public User(String name, String type) {

		this.name = name;

		this.type = type;

	}

}

class Student extends User {

	public Student() {
	}

	public Student(String name, String type) {

		super(name, type);

	}

}

class Staff extends Student {

	public Staff(String name, String type) {

		super(name, type);

	}

	public Staff() {
	}

}

class Citizen extends User {

	public Citizen(String name, String type) {

		super(name, type);

	}

}

public class Test {

	public void useLibrary(User user) {

		System.out.println(user.type + " " + user.name + "이(가) 도서관을 이용합니다.");

	}

	public static void main(String[] args) {

		User user = new Staff();

		Citizen city01;

		if (user instanceof Citizen) {

			city01 = (Citizen) user;

			System.out.println("OK~");

		}

		else

			System.out.println("Not ok~");

	}

}
