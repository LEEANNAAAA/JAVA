package may_0527;

import java.util.Scanner;

public class Chap_3 {

	public static void main(String[] args) {
		// ���� 5�� �Է¹޾Ƽ� �����ϰ� ��ü �� ���� ���ϰ� ��� ���ϱ�

		Scanner sc = new Scanner(System.in);

		int[] sco;
		sco = new int[5];
		// int[] sco = new int[5] �� �� �� ���� ����
		int i;

		for (i = 0; i < sco.length; i++) {
			System.out.printf("%d��° ���� �Է� : ", i + 1);
			sco[i] = sc.nextInt();
		}

		int sum = 0;
		for (i = 0; i < sco.length; i++) {
			sum += sco[i];
		}
		double avg = (double) sum / sco.length;

		System.out.println("��ü �� : " + sum);
		System.out.printf("��ü ��� ���� : %.2f\n", avg);
		
	}
}
