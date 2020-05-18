import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.print("원하는 단>> ");
			int n = sc.nextInt();

			if (n < 0) {
				System.out.println("종료합니다");
				break;
			}

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d\n", n, i, n * i);
			}
		}
	}
}
