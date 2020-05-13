package ex0429_07;

public class WrongPasswordException extends Exception{
	public WrongPasswordException() {} //기본 생성자
	public WrongPasswordException(String message) {
		super(message); 
	}

}
