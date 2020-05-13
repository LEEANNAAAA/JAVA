import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오");
		int a = sc.nextInt();

		System.out.printf("백의 자리수 : %d\n", a / 100);
		System.out.printf("십의 자리수 : %d\n", a / 10 % 10);
		System.out.printf("일의 자리수 : %d", a % 10);

	}
}
