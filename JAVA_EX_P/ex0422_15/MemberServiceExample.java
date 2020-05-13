package ex0422_15;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService(); // 객체생성
		
		boolean result = memberService.login("hong", "12345"); //result 변수 선언
		
		if(result) { 
			System.out.println("로그인 되었습니다."); // true 인 경우
			memberService.logout("hong");
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다."); // false 인 경우
		}

	}

}
