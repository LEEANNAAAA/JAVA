package ex0427_03;

public class Cat implements Soundable{

	@Override //인터페이스 sound 재정의
	public String sound() {
		return "야옹"; // 야옹이 sound의 리턴값
	}

}
