package may_0527;

public class Chap_2 {

	public static void main(String[] args) {
		String str1 = "�Ӳ���";
		String str2 = "�Ӳ���";
		String str3 = new String("�Ӳ���");
		String str4 = "�Ӳ���";

		if (str1 == str2) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}

		if (str3 == str4) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}

		if (str1.equals(str2)) {
			System.out.println("��ġ");
		} else {
			System.out.println("����ġ");
		}
	}

}
