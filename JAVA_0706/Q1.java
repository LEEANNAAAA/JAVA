import java.util.Scanner;

public class Q1 {

	public static void menu() {
		System.out.print("(1) ���� (2) ���� (3) ���� (4) ���������ȵ� [����] : ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < 10; i++) {
			System.out.println("Q1. 2018�� ���� �ް� ��ȹ��?");
			menu();
			int n = sc.nextInt();

			if (n > 4 || n < 1) {
				System.out.println("�ٽ� �Է��ϼ���");
				i--;
				continue;
			}

			switch (n) {

			case 1:
				arr[0] += 1;
				break;
			case 2:
				arr[1] += 1;
				break;
			case 3:
				arr[2] += 1;
				break;
			case 4:
				arr[3] += 1;
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d�� : ", i+1 );
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("##");
			}
			System.out.println();
		}

	}
}
