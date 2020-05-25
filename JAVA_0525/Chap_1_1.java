package may_0525;

import java.util.Scanner;

public class Chap_1_1 {
	// 1부터 50사이의 숫자 10개를 입력받아서 숫자만큼의 별표를 출력하는 프로그램

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int j = 1; j <= 10; j++) {
			System.out.printf("막대%d의 길이: ", j);
			int num = sc.nextInt();

			if (!(num >= 1 && num <= 50)) {
				System.out.println("허용되지 않는 길이입니다.\n다시 입력하세요!");
				j--;
				continue;
			}

			for (int i = 1; i <= num; i++) {
				System.out.print("#");
			}
			System.out.println();
		}

	}
}
