package july_0713;

public class RetEx {
	
	public static void main(String[] args) {
		RemoteControl s = new Radio();
		s.turnOn();
		s.setMute(true);
		Radio ok = (Radio) s;	//����Ŭ���������� ���� ������ �������Ƿ� ���� ����ȯ�ؼ� �ڽ� Ŭ���� �޼ҵ带 �����´�, �޼ҵ� �̸��� ������ ��� �ڽ�Ŭ������ ���� �����´�
		ok.setVolume(90);
		s.turnOff();
		
	}
}
