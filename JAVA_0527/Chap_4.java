package may_0527;

import java.util.Scanner;

public class Chap_4 {

	public static void main(String[] args) {
		// ���� 0~100������ �� 5�� �߻� �迭�� ����, �� �� �ִ밪 ���

		int[] num;
		num = new int[5];
		int i;
		int max = 0;

		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101);
			System.out.printf("%4d",num[i]);
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("\n�ִ밪 : " + max);
	}
}
