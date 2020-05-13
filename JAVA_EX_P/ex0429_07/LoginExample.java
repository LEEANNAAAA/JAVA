package ex0429_07;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white","12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			login("blue","54321");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void login(String id, String password) 
			throws NotExistIDException, WrongPasswordException{ //login메소드 내부에 2가지 예외 > throws(예외를 떠넘기는 것)
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다."
		);}
			if(!password.equals("12345")) {
				throw new WrongPasswordException("패스워드가 틀립니다." //예외발생
			);
	
}
	}
}

