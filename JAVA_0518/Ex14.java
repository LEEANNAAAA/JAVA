import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("���ϴ� ��>> ");
			int n = sc.nextInt();

			if (n < 0) {
				System.out.println("�����մϴ�");
				break;
			}

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", n, i, n * i);
			}
		}
	}
}
