import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("¦��");
		} else {
			System.out.println("Ȧ��");
		}

		System.out.printf("�Է¹��� ���� %d�Դϴ�.", a);

	}
}