import java.util.Scanner;

public class Chap_9 {

	public static void main(String[] args) {

		// ������ ���� ������ �ݺ� �Է¹޾� �� �߿� ��ü ¦���� ������ ����ϴ� ���α׷��� �ۼ�

		Scanner sc = new Scanner(System.in);

		System.out.println((0%2));
		
		int num;
		int cnt = 0;	//�������� ������ 0 ���� �ʱ�ȭ

		for (;;) {
			System.out.println("���� ������ �Է��Ͻÿ�.(������(�����Է�)): ");
			num = sc.nextInt();

			if (num <= 0) {
				break;
			}

			if (num % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("��ü ¦���� ���� : " + cnt);
		
		
//		Scanner sc = new Scanner(System.in);
//		int cnt=0;
//		
//		while (true) {
//			System.out.println("�����Է� : ");
//			int num = sc.nextInt();
//
//			if (num <= 0) {
//				break;
//			}
//			if (num % 2 == 0) {
//				cnt++;
//
//			}
//		}
//		System.out.println("¦���� ����" + cnt);
	}
}
