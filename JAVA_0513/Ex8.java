import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if (a % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}

		System.out.printf("입력받은 수는 %d입니다.", a);

	}
}