import java.util.Scanner;

public class Chap_10 {

	public static void main(String[] args) {
		// �Է��� ��� ���� ���鿡 ���Ͽ� 1���� �� ���������� ���� ���� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		int i;
		int num;
		int mul = 1;

		while (true) {

			System.out.println("������ ������ �Է��Ͻÿ�");
			num = sc.nextInt();

			System.out.println("----------------------------");
			System.out.println("n\t1���� n������ ��");
//			System.out.printf("%5s%30s\n","n","1���� n������ ��");
			System.out.println("----------------------------");

			mul = 1;
			for (i = 1; i <= num; i++) {
//				System.out.printf("%5d%30d\n",i,mul=mul*i);
				mul *= i;
				System.out.println(i + "\t" + mul);
			}

			System.out.println("��� �Ͻðڽ��ϱ�?(y/n)");
			sc.nextLine();
			char ans = sc.nextLine().charAt(0);

			if (ans == 'n') {
				System.out.println("����");
				break;
			}
		}

	}
}
