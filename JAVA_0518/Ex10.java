import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// ö�а����� �߰���� ������ ��ü ��������� ���Ͻÿ�
		// ���ѷ��� ���¿��� �߰���� ������ �Է¹޾� ��ü���� ���Ѵ�.
		// ���ѷ����� ���������� ���� �ǵ������� ������ ������ �Է��Ѵ�.
		// �л� ���� �� �� ����

		Scanner sc = new Scanner(System.in);

		int num = 1;
		int sum = 0;

		while (true) {
			System.out.print("ö�а��� ���� �Է�>> ");
			int phil = sc.nextInt();

			if (phil >= 0) {
				sum += phil;
				System.out.println(num+"�� �л� ���� : "+sum);
			} else {
				break;
			}
			num++;
		}
		
		System.out.println("ö�� ���� ��ü �� ���� : " + sum);
		
		int avg = sum / (num - 1);
		System.out.println("ö�� ���� ��ü ������� : " + avg);
	}
}