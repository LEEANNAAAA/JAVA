package july_0713;

public class Radio implements RemoteControl {	//Radio�� ����Ŭ����

	private int volume;
	
	void test() {
		System.out.println("���� �����Դϴ�.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("������ �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("������ ���ϴ�");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� Audio ���� : "+volume);
	}

}
