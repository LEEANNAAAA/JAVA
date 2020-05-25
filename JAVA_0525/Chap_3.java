package may_0525;

import java.util.Scanner;

public class Chap_3 {
	public static void main(String[] args) {
		// 엉뚱한 숫자 or 프로그램 종료

		Scanner sc = new Scanner(System.in);
		int result = 0;

		while (true) {
			menu();
			System.out.print("\n메뉴 선택>> ");
			int n = sc.nextInt();

			if (n == 5) {
				System.out.println("프로그램 종료");
				return;
			} else if (n >= 6) {
				System.out.println("다시 입력하세요\n");
//				menu();
//				System.out.println("\n메뉴 선택>> ");
//				n = sc.nextInt();
				continue;
			}

			System.out.print("정수1 입력>> ");
			int x = sc.nextInt();
			System.out.print("정수2 입력>> ");
			int y = sc.nextInt();

			switch (n) {
			case 1:
				result = add(x, y);
				break;
			case 2:
				result = sub(x, y);
				break;
			case 3:
				result = mul(x, y);
				break;
			case 4:
				result = div(x, y);
				break;
			}
			System.out.printf("계산 결과 : %d", result);
			System.out.println("\n");
		}
	}

	////////////////////////////////////////////
	
	public static int add(int x, int y) {
		return x + y; // 해당 메소드만 종료
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static int div(int x, int y) {
		return x / y;
	}

	////////////////////////////////////////////

	public static void menu() {
		System.out.println("1.덧셈");
		System.out.println("2.뺄셈");
		System.out.println("3.곱셈");
		System.out.println("4.나눗셈");
		System.out.println("5.종료");
	}

}
