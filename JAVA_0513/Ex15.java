import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Է��ϼ���");
		char ch = sc.nextLine().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("���ĺ� �빮�� ���");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("���ĺ� �ҹ��� ���");
		} else if (ch >= '1' && ch <= '9') {
			System.out.println("���� ���");
		} else {
			System.out.println("��Ÿ���� ���");
		}

	}
}
