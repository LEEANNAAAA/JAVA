import java.lang.reflect.Array;
import java.util.Scanner;

public class Chap_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char ans;

		while (true) {
			System.out.println("1.����/����/��");
			System.out.println("2.��Ʈ����");
			System.out.println("\n���Ӽ���>> ");
			n = sc.nextInt();
			
			if(n==1) {
				int cpu = (int) (Math.random() * 3) + 1;
				System.out.println("����(1) ����(2) ��(3)�� ����>> ");
				int num=sc.nextInt();
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

				String vic;

				switch (num) { // cpu�� ���� default�κ� ����� ���� x / num�� ���� ��� ���������� �۵�
				case 1:
					if (cpu == 2) {
						vic = "���� ��";
					} else if (cpu == 3) {
						vic = "��ǻ�� ��";
					} else {
						vic = "���º�";
					}
					System.out.println("������ ����� \"" + vic + "\"�Դϴ�.\n");
					break;
				case 2:
					if (cpu == 3) {
						vic = "���� ��";
					} else if (cpu == 1) {
						vic = "��ǻ�� ��";
					} else {
						vic = "���º�";
					}
					System.out.println("������ ����� \"" + vic + "\"�Դϴ�.\n");
					break;
				case 3:
					if (cpu == 1) {
						vic = "���� ��";
					} else if (cpu == 2) {
						vic = "��ǻ�� ��";
					} else {
						vic = "���º�";
					}
					System.out.println("������ ����� \"" + vic + "\"�Դϴ�.\n");
					break;
			}
				
			} else {
			System.out.println("\n������ ����Ͻðڽ��ϱ�?(y/n)");
			sc.nextLine();
			ans = sc.nextLine().charAt(0);
			

			if (ans == 'n') {
				System.out.println("������ �����մϴ�.\n");
				break;
			}

		}

	}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int n;
//		char ans;
//
//		while (true) {
//			System.out.println("1.����/����/��");
//			System.out.println("2.��Ʈ����");
//			System.out.println("\n���Ӽ���>> ");
//			n = sc.nextInt();
//
//			if (n == 1) {
//
//				System.out.println("�Է�");
//				int me = sc.nextInt();
//				int cpu = (int) (Math.random() * 3) + 1;
//				System.out.println(cpu);
//
//				if (me == 1) {
//					System.out.println("\n���� - ");
//				} else if (me == 2) {
//					System.out.println("\n���� - ");
//				} else if (me == 3) {
//					System.out.print("\n�� - ");
//				} else {
//					System.out.println("\n����");
//				}
//
//				if (cpu == 1) {
//					System.out.println("����\n");
//				} else if (cpu == 2) {
//					System.out.println("����\n");
//				} else {
//					System.out.println("��\n");
//				}
//
//				String vic = "";
//
//				if (me == 1) {
//					if (cpu == 1) {
//						vic = "���º�";
//					} else if (cpu == 2) {
//						vic = "��ǻ�� ��";
//					} else {
//						vic = "���� ��";
//					}
//				} else if (me == 2) {
//					if (cpu == 2) {
//						vic = "���º�";
//					} else if (cpu == 3) {
//						vic = "��ǻ�� ��";
//					} else {
//						vic = "���� ��";
//					}
//				}
//				if (me == 3) {
//					if (cpu == 3) {
//						vic = "���º�";
//					} else if (cpu == 1) {
//						vic = "��ǻ�� ��";
//					} else {
//						vic = "���� ��";
//					}
//				}
//				System.out.println("������ ����� \"" + vic + "\"�Դϴ�.\n");
//			} else {
//				System.out.println("\n������ ����Ͻðڽ��ϱ�?(y/n)");
//				sc.nextLine();
//				ans=sc.nextLine().charAt(0);
//				
//				if(ans=='n') {
//					System.out.println("������ �����մϴ�.\n");
//					break;
//				} else if(ans=='y') {
//					System.out.println("����մϴ�");
//				} else {
//					System.out.println("�߸��Է�");
//				}
//			}
//		}
}
}
