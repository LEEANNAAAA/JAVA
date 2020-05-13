package ex0427_03;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat()); // cat과 dog는 인터페이스의 구현 객체 > soundable 이라는 인터페이스 구현
		printSound(new Dog()); // 인터페이스 변수에 어떤 구현 객체이든지 넣을 수 있다

	}

}
