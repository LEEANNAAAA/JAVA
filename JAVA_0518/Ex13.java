import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 1;

		while (true) {
			System.out.println("�������� �Է��ϼ���");
			int num = sc.nextInt();
			if (num > 0) {
				for (i = 1; i < 10; i++) {
					System.out.printf("%d x %d = %d\n", num, i, num * i);
				}
			} else {
				break;
			}
		}
		System.out.println("����");
	}
}
