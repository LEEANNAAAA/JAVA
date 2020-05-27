package may_0527;

import java.util.Scanner;

public class Chap_4 {

	public static void main(String[] args) {
		// 난수 0~100사이의 값 5개 발생 배열에 저장, 그 중 최대값 출력

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
		System.out.println("\n최대값 : " + max);
	}
}
