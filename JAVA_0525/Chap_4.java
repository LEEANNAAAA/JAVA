package may_0525;

import java.util.Scanner;

public class Chap_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;

		while (true) {
			menu();
			System.out.println("[메뉴 선택]: ");
			n1 = sc.nextInt();

			if (n1 == 3) {
				System.out.println("종료");
				return;
			} else if (n1 > 3) {
				System.out.println("다시 입력하세요\n");
				continue;
			}

			switch (n1) {
			case 1:
				System.out.print("임의의 정수 입력: ");
				int n2 = sc.nextInt();
				for (int i = 1; i <= n2; i++) {
					if (n2 % i == 0) {
						System.out.print(i + " ");
					}
				}
				break;
			case 2:
				System.out.println("임의의 정수 입력: ");
				int n3 = sc.nextInt();
				int j = 0;

				while (true) {
					for (int i = 1; i <= n3; i++) {
						if (n3 % i == 0){
							j++;
						}
					}
					if (j == 2) {
						System.out.print("소수입니다.");
					} else {
						System.out.println("소수가 아닙니다.");
					}
					break;
				}
				System.out.println("\n");
			}
		}
	}

	public static void menu() {
		System.out.println(">> MENU");
		System.out.print("(1)약수 출력 (2)소수 판단 (3)종료 ");
	}

}
