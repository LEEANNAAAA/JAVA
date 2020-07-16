package july_0713;

public interface RemoteControl {
	int MAX_VOLUME = 100; // 대문자로 모두 쓸 경우 public abstract final 의미 내포
	int MIN_VOLUME = 0;

	void turnOn(); // public abstract 내포

	void turnOff();

	default void testJJ() {};
	
	static void changeBattery() {	
		System.out.println("건전지를 교환합니다.");
	}

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음처리합니다");
		} else {
			System.out.println("무음해제합니다");

		}
	}
}
