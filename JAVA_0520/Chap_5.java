import java.util.Scanner;

public class Chap_5 {

	public static void main(String[] args) {
		//���� �Է��ϸ� ��ĥ���� �ִ��� ���
		//����� �Է����� ������ �ٽ��Է��ϼ��� ��� �ٽ� ���
		Scanner sc = new Scanner(System.in);
		
		int mon;
		int days;
		
		do {
			System.out.println("���� �Է����ּ���");
			mon = sc.nextInt();
			
//			if(!(mon>=1&&mon>=12))
//			System.out.println("�߸��Է�");
//			else break;
//			}while(true);
			
//			switch~~
			
		switch(mon) {
			case 1: case 3: case 5: case 7: case 10: case 12:
				days = 31;
				System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�\n",mon, days);
				break;
			case 2:
				days = 28;
				System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�\n",mon, days);
				break;
			case 4: case 6: case 8: case 9: case 11:
				days = 30;
				System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�\n",mon, days);
				break;
			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				break;
				
			}
		
		}while(!(mon>=1&&mon>=12));
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//
//		int mon;
//		int days = 0;
//
//			while(true) {
//			System.out.println("�Է�");
//			mon = sc.nextInt();
//			
//			if(mon%2==0 && mon!=2 && mon<=12) {
//				days=30;			
//				System.out.printf("%d���� %d�� �Դϴ�.\n", mon, days);
//			} else if(mon%2==1 && mon<=12) {
//				days=31;
//				System.out.printf("%d���� %d�� �Դϴ�.\n", mon, days);
//			} else if(mon==2) {
//				days=28;
//				System.out.printf("%d���� %d�� �Դϴ�.\n", mon, days);
//			} else {
//				System.out.println("�߸� �Է�!!");
//			}
//
//			
//		
//			}
		
	}

}
