package may_0525;

import java.util.Scanner;

public class Chap_4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;

		for (;;) {
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

			System.out.print("������ ���� �Է�: ");
			int n2 = sc.nextInt();

			switch (n1) {
			case 1:
				div(n2);
				break;

			case 2:
				prime(n2);
				break;
			}
			System.out.println("\n");
		}
	}

	//////////////////////////////////////////////
	
	public static void div(int n2) {
		for (int i = 1; i <= n2; i++) {
			if (n2 % i == 0) {
				System.out.print(i + " ");
			}
		}
		return;
	}

	//////////////////////////////////////////////

	public static void prime(int n2) {
		int i;
		for (i = 2; i < n2; i++) {
			if (n2 % i == 0) {
				break;
			}
		}
		if (i==n2) {
			System.out.print("�Ҽ��Դϴ�.");
		} else {
			System.out.print("�Ҽ��� �ƴմϴ�.");
		}
		return;
	}
	
	//////////////////////////////////////////////

	public static void menu() {
		System.out.println(">> MENU");
		System.out.print("(1)��� ��� (2)�Ҽ� �Ǵ� (3)���� ");
	}

}