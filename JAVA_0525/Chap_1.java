package may_0525;

import java.util.Scanner;

public class Chap_1 {
	// 1���� 50������ ���� 10���� �Է¹޾Ƽ� ���ڸ�ŭ�� ��ǥ�� ����ϴ� ���α׷�

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int j = 1; j < 11; j++) {
			System.out.printf("����%d�� ����: ", j);
			int num = sc.nextInt();

			if (num <= 50 && num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print("#");
				}
			} else {
				System.out.println("������ �ʴ� �����Դϴ�.\n�ٽ� �Է��ϼ���!");
				j -= 1;
			}
			System.out.println();
		}

		
//	boolean run = true;
//	int j;
//
//	while (run) {
//		for (j = 1; j < 11; j++) {
//			System.out.printf("����%d�� ����: ", j);
//			int num = sc.nextInt();
//
//			if (num <= 50 && num > 0) {
//				for (int i = 1; i <= num; i++) {
//					System.out.print("#");
//				}
//			} else {
//				System.out.println("������ �ʴ� �����Դϴ�.\n�ٽ� �Է��ϼ���!");
//				j -= 1;
//			}
//			System.out.println();
//		}
//		if (j == 11) {
//			run = false;
//		}
//
//	}

	}

}
