import java.util.Scanner;

public class Chap_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i;
		int j;
		int num;

		System.out.println("숫자를 입력하시오: ");
		num = sc.nextInt();

		for (j = 1; j <= num; j++) {
			for (i = 1; i <= j; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
