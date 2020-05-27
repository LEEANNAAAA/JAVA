package may_0527;

public class Chap_2 {

	public static void main(String[] args) {
		String str1 = "임꺽정";
		String str2 = "임꺽정";
		String str3 = new String("임꺽정");
		String str4 = "임꺽정";

		if (str1 == str2) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}

		if (str3 == str4) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}

		if (str1.equals(str2)) {
			System.out.println("일치");
		} else {
			System.out.println("불일치");
		}
	}

}
