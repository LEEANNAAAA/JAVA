package may_0525;

import java.util.Scanner;

public class Chap_1_1 {
	// 1���� 50������ ���� 10���� �Է¹޾Ƽ� ���ڸ�ŭ�� ��ǥ�� ����ϴ� ���α׷�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int j = 1; j <= 10; j++) {
			System.out.printf("����%d�� ����: ", j);
			int num = sc.nextInt();

			if (!(num >= 1 && num <= 50)) {
				System.out.println("������ �ʴ� �����Դϴ�.\n�ٽ� �Է��ϼ���!");
				j--;
				continue;
			}

			for (int i = 1; i <= num; i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}
}
