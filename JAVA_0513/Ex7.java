import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�");
		int a = sc.nextInt();

		System.out.printf("���� �ڸ��� : %d\n", a / 100);
		System.out.printf("���� �ڸ��� : %d\n", a / 10 % 10);
		System.out.printf("���� �ڸ��� : %d", a % 10);

	}
}
