package may_0525;

import java.util.Scanner;

public class Chap_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;

		while (true) {
			menu();
			System.out.println("[�޴� ����]: ");
			n1 = sc.nextInt();

			if (n1 == 3) {
				System.out.println("����");
				return;
			} else if (n1 > 3) {
				System.out.println("�ٽ� �Է��ϼ���\n");
				continue;
			}

			switch (n1) {
			case 1:
				System.out.print("������ ���� �Է�: ");
				int n2 = sc.nextInt();
				for (int i = 1; i <= n2; i++) {
					if (n2 % i == 0) {
						System.out.print(i + " ");
					}
				}
				break;
			case 2:
				System.out.println("������ ���� �Է�: ");
				int n3 = sc.nextInt();
				int j = 0;

				while (true) {
					for (int i = 1; i <= n3; i++) {
						if (n3 % i == 0){
							j++;
						}
					}
					if (j == 2) {
						System.out.print("�Ҽ��Դϴ�.");
					} else {
						System.out.println("�Ҽ��� �ƴմϴ�.");
					}
					break;
				}
				System.out.println("\n");
			}
		}
	}

	public static void menu() {
		System.out.println(">> MENU");
		System.out.print("(1)��� ��� (2)�Ҽ� �Ǵ� (3)���� ");
	}

}
