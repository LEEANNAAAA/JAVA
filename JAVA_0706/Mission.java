import java.util.Scanner;

public class Mission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ڿ� �Է� : ");
		String str = sc.next();

		String result = "";

		System.out.println("���ڿ� �Ųٷ� ���");

		for (int i = str.length() - 1; i > -1; i--) {
			result += str.charAt(i);
		}
		System.out.println(result);

	}
}
