import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
// Ű�� �����Ը� �Է¹޾�, �������� ������ ����ϴ� ���α׷��� �ۼ�
// Ű�� ���� ǥ�� ü���� ���ϴ� ����� ����(Ű)���� 100�� ���� �� ���� 0.9�� ���Ͽ� ǥ��ü���� ���ϸ� �ȴ�.

		Scanner sc = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���");
		double h = sc.nextInt();
		System.out.println("�����Ը� �Է��ϼ���");
		double w = sc.nextInt();

		double bw = (h - 100) * 0.9;

		if (w > bw) {
			System.out.println("��ü��");
		} else if (w >= bw - 5 && w <= bw + 5) {
			System.out.println("ǥ��");
		} else {
			System.out.println("��ü��");
		}

	}
}
