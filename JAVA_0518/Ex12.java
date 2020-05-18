import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println("Hello~\n");
		}

		System.out.println("-------------------------------\n");

		// 2.
		int mul = i * 9;
		for (i = 1; i < 10; i++) {
			System.out.printf("9 x %d = %d\n\n", i, mul);
		}

		System.out.println("-------------------------------\n");

		// 3.
		int sum = 0;
		System.out.println("최종 경계값>> ");
		int n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("합 : " + sum);

	}
}