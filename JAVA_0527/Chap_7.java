package may_0527;

import java.util.Scanner;

public class Chap_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num1;
		num1 = new int[10];
		int j;
		char ans;

		while (true) {
			System.out.println("\n������ ���� ����");
			prn(num1);

			System.out.print("\n\n�¼� ����(1~10): ");
			int m = sc.nextInt();

			if (num1[m - 1] == 0) {
				num1[m - 1] = 1;
				System.out.println("����Ǿ����ϴ�.\n");
			} else {
				System.out.println("�̹� ����Ǿ����ϴ�.\n");
				continue;
			}
			prn(num1);

			sc.nextLine();
			System.out.println("\n����Ͻðڽ��ϱ�(y/n)?");
			ans = sc.nextLine().charAt(0);

			if (ans == 'n') {
				System.out.println("����\n");
				break;
			}
		}

	}

////////////////////////////////////////////////////////////////	
	public static void prn(int[] v) {
		System.out.println("----------------------------");

		for (int j = 0; j < v.length; j++) {
			System.out.printf("%d ", j + 1);
		}
		System.out.println("\n----------------------------");

		for (int j = 0; j < v.length; j++) {
			System.out.printf("%d ", v[j]);
		}
	}
////////////////////////////////////////////////////////////////	

}
