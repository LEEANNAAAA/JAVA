package ex0422_15;

public class MemberService {
	boolean login(String id, String password) {
		if(id.equals("hong") && password.contentEquals("12345")) { // ���ڿ��� ���� ���� equals ���, && : ��������(and)
			return true; // "hong"�̰� "12345"�̸� true
		} else { 
			return false; // �ƴ� ��� false
		}
	}
	
	void logout(String id) { //�α׾ƿ��� ���, ���ϰ��� ���� �޼ҵ� > void
		System.out.println("�α׾ƿ� �Ǿ����ϴ�");
	}
}
