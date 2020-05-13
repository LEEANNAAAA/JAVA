package ex0422_15;

public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong") && password.contentEquals("12345")) { // 문자열을 비교할 때는 equals 사용, && : 논리연산자(and)
			return true; // "hong"이고 "12345"이면 true
		} else { 
			return false; // 아닌 경우 false
		}
	}
	
	void logout(String id) { //로그아웃의 경우, 리턴값이 없는 메소드 > void
		System.out.println("로그아웃 되었습니다");
	}
}
