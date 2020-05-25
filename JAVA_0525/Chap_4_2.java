package may_0525;

import java.util.Scanner;

public class Chap_4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0;

		for (;;) {
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

			System.out.print("임의의 정수 입력: ");
			int n2 = sc.nextInt();

			switch (n1) {
			case 1:
				div(n2);
				break;

			case 2:
				prime(n2);
				break;
			}
			System.out.println("\n");
		}
	}

	//////////////////////////////////////////////
	
	public static void div(int n2) {
		for (int i = 1; i <= n2; i++) {
			if (n2 % i == 0) {
				System.out.print(i + " ");
			}
		}
		return;
	}

	//////////////////////////////////////////////

	public static void prime(int n2) {
		int i;
		for (i = 2; i < n2; i++) {
			if (n2 % i == 0) {
				break;
			}
		}
		if (i==n2) {
			System.out.print("소수입니다.");
		} else {
			System.out.print("소수가 아닙니다.");
		}
		return;
	}
	
	//////////////////////////////////////////////

	public static void menu() {
		System.out.println(">> MENU");
		System.out.print("(1)약수 출력 (2)소수 판단 (3)종료 ");
	}

}
