package ex0422_15;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService(); // ��ü����
		
		boolean result = memberService.login("hong", "12345"); //result ���� ����
		
		if(result) { 
			System.out.println("�α��� �Ǿ����ϴ�."); // true �� ���
			memberService.logout("hong");
		} else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�."); // false �� ���
		}

	}

}
