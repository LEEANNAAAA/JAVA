import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// ���� -1 , ���� - 2 , �� - 3
		// ��ǻ�� ��, ���� ��, ���º�

		Scanner sc = new Scanner(System.in);
		System.out.println("����(1) ����(2) ��(3)�� ����>> ");
		int num = sc.nextInt();
		int cpu = (int) (Math.random() * 3) + 1;
		System.out.println(cpu);

		if (num == 1) {
			System.out.print("\n���� - ");
		} else if (num == 2) {
			System.out.print("\n���� - ");
		} else if (num == 3) {
			System.out.print("\n�� - ");
		} else {
			System.out.println("\n����");
		}

		if (cpu == 1) {
			System.out.println("����\n");
		} else if (cpu == 2) {
			System.out.println("����\n");
		} else {
			System.out.println("��\n");
		}

		String vic; // String = "";(�ƹ����� ����)�� ���൵ ����(���� ""�� ���� default���� ������ sout���� vic������ > 1-3����
					// ���� ���� ��쿡 ���� ����� �����Ƿ�

		switch (num) { // cpu�� ���� default�κ� ����� ���� x / num�� ���� ��� ���������� �۵�
		case 1:
			if (cpu == 2) {
				vic = "���� ��";
			} else if (cpu == 3) {
				vic = "��ǻ�� ��";
			} else {
				vic = "���º�";
			}
			break;
		case 2:
			if (cpu == 3) {
				vic = "���� ��";
			} else if (cpu == 1) {
				vic = "��ǻ�� ��";
			} else {
				vic = "���º�";
			}
			break;
		case 3:
			if (cpu == 1) {
				vic = "���� ��";
			} else if (cpu == 2) {
				vic = "��ǻ�� ��";
			} else {
				vic = "���º�";
			}
			break;
		default:
			vic = "����";
		}

		System.out.println("������ ����� \"" + vic + "\"�Դϴ�.\n");
		System.out.printf("��ǻ�ʹ� %s�� �½��ϴ�.\n\n", cpu == 1 ? "����" : cpu == 2 ? "����" : "��");
		System.out.println("���� �ºο���!");

	}
}