import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("����� ������ (KOREA(1)/ETC(2))?");
//		int a = sc.nextInt();
//
//		String x;
//		String y;
//
//		if (a == 1) {
//			x = "�ѱ�";
//		} else if (a == 2) {
//			x = "�ܱ�";
//		} else {
//			return;
//		}
//
//		System.out.println("����� ������ (MALE(3)/FEMALE(4))?");
//		int b = sc.nextInt();
//
//		if (b == 3) {
//			y = "����";
//		} else if (b == 4) {
//			y = "����";
//		} else {
//			return;
//		}
//
//		System.out.println("����� " + x + " " + y + " �Դϴ�.");
		
		final int KOR = 1;
		final int ETC = 2;
		final int MALE = 3;
		final int FEMALE = 4;
		
		System.out.println("����� ������ (KOREA(1)/ETC(2))?");
		int country = sc.nextInt();
		
		System.out.println("����� ������ (MALE(3)/FEMALE(4))?");
		int gender = sc.nextInt();
		
		if(country==KOR) {
			if(gender==MALE) {
				System.out.println("����� �ѱ� �����Դϴ�.");
			} else {
				System.out.println("����� �ѱ� �����Դϴ�.");
			}
		} else {
			if(gender==MALE) {
				System.out.println("����� �ѱ� �����Դϴ�.");
			} else {
				System.out.println("����� �ѱ� �����Դϴ�.");
			}
		}
		
 
	}
}
