import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ǥ�� : ");
		int sta = sc.nextInt();
		double tax;
		
//		if(sta>8000) {
//			System.out.println("�ҵ漼�� "+ (sta*0.35)+"�����Դϴ�.");
//		} else if(sta>4000) {
//			System.out.println("�ҵ漼�� "+ (sta*0.26)+"�����Դϴ�.");
//		} else if(sta>1000) {
//			System.out.println("�ҵ漼�� "+ (sta*0.17)+"�����Դϴ�.");
//		} else if(sta<=1000) {
//			System.out.println("�ҵ漼�� "+ (sta*0.08)+"�����Դϴ�.");
//		}
		
		if(sta<=1000) {
			tax = sta *0.08;
		} else if(sta<=4000) {
			tax = sta *0.17;
		} else if(sta<=8000) {
			tax = sta *0.26;
		} else {
			tax = sta *0.35;
		}

		System.out.printf("�ҵ漼: %.0f\n", tax);
	}

}
