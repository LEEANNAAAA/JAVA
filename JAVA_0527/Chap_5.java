package may_0527;

import java.util.Scanner;

public class Chap_5 {

	public static void main(String[] args) {
		// 난수 0~100사이의 값 5개 발생 배열에 저장, 그 중 최대값 출력

		int[] num;
		num = new int[5];
		int i, j;
		int m;
		int tmp;

		for (i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 101);
			System.out.printf("%4d", num[i]);
		}

		for (i = 0; i < 4; i++) {
			m = i;
			for (j = i + 1; j < 5; j++) {
				if (num[m] > num[j]) {
					m = j;
				}
			}
			tmp = num[i];
			num[i] = num[m];
			num[m] = tmp;
		}
		System.out.println();
		for (int k = 0; k < num.length; k++) {
			System.out.print(num[k] + " ");
		}

	}
}
