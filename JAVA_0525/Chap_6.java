package may_0525;

import java.util.Scanner;

public class Chap_6 {
	public static void main(String[] args) {
//�������� ������ 5�� �Է¹ް� ������� ���ϱ�
		Scanner sc = new Scanner(System.in);

		int[] sco;
		sco = new int[5];

		for (int i = 0; i < sco.length; i++) {
			System.out.printf("%d�� ���� �Է� : ", i + 1);
			sco[i] = sc.nextInt();
		}
		for (int i = 0; i < sco.length; i++) {
			System.out.printf("%4d��", sco[i]);
		}

		int sum = 0;
		for (int i = 0; i < sco.length; i++) {
			sum += sco[i];
		}

		System.out.printf("\n��ü ���� �� : %d��\n", sum);

		double avg = (double) sum / sco.length;
		System.out.printf("��ü ������� : %.2f��", avg);
	}

}
