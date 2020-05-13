package ex0429_07;

public class NotExistIDException extends Exception{ //exception을 상속받는다
	public NotExistIDException() {} //기본 생성자
	public NotExistIDException(String message) {
		super(message); //message를 부모의 생성자 매개값으로
	}

}
