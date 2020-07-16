package july_0713;

public class RetEx {
	
	public static void main(String[] args) {
		RemoteControl s = new Radio();
		s.turnOn();
		s.setMute(true);
		Radio ok = (Radio) s;	//상위클래스에서만 값을 가져올 수있으므로 강제 형변환해서 자식 클래스 메소드를 가져온다, 메소드 이름이 동일한 경우 자식클래스의 값을 가져온다
		ok.setVolume(90);
		s.turnOff();
		
	}
}
