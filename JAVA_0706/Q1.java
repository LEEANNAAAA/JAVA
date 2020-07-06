import java.util.Scanner;

public class Q1 {

	public static void menu() {
		System.out.print("(1) 여행 (2) 독서 (3) 방콕 (4) 아직결정안됨 [선택] : ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];

		for (int i = 0; i < 10; i++) {
			System.out.println("Q1. 2018년 여름 휴가 계획은?");
			menu();
			int n = sc.nextInt();

			if (n > 4 || n < 1) {
				System.out.println("다시 입력하세요");
				i--;
				continue;
			}

			switch (n) {

			case 1:
				arr[0] += 1;
				break;
			case 2:
				arr[1] += 1;
				break;
			case 3:
				arr[2] += 1;
				break;
			case 4:
				arr[3] += 1;
				break;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번 : ", i+1 );
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("##");
			}
			System.out.println();
		}

	}
}
