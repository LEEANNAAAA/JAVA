package may_0525;

import java.util.Scanner;

public class Chap_3 {
	public static void main(String[] args) {
		// ������ ���� or ���α׷� ����

		Scanner sc = new Scanner(System.in);
		int result = 0;

		while (true) {
			menu();
			System.out.print("\n�޴� ����>> ");
			int n = sc.nextInt();

			if (n == 5) {
				System.out.println("���α׷� ����");
				return;
			} else if (n >= 6) {
				System.out.println("�ٽ� �Է��ϼ���\n");
//				menu();
//				System.out.println("\n�޴� ����>> ");
//				n = sc.nextInt();
				continue;
			}

			System.out.print("����1 �Է�>> ");
			int x = sc.nextInt();
			System.out.print("����2 �Է�>> ");
			int y = sc.nextInt();

			switch (n) {
			case 1:
				result = add(x, y);
				break;
			case 2:
				result = sub(x, y);
				break;
			case 3:
				result = mul(x, y);
				break;
			case 4:
				result = div(x, y);
				break;
			}
			System.out.printf("��� ��� : %d", result);
			System.out.println("\n");
		}
	}

	////////////////////////////////////////////
	
	public static int add(int x, int y) {
		return x + y; // �ش� �޼ҵ常 ����
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

	////////////////////////////////////////////

	public static void menu() {
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.println("5.����");
	}

}
