package july_0713;

public interface RemoteControl {
	int MAX_VOLUME = 100; // �빮�ڷ� ��� �� ��� public abstract final �ǹ� ����
	int MIN_VOLUME = 0;

	void turnOn(); // public abstract ����

	void turnOff();

	default void testJJ() {};
	
	static void changeBattery() {	
		System.out.println("�������� ��ȯ�մϴ�.");
	}

	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("����ó���մϴ�");
		} else {
			System.out.println("���������մϴ�");

		}
	}
}
