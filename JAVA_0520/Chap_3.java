import java.util.Scanner;

public class Chap_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int sum=0;
		double avg;
		
		while(true) {
			System.out.print("�����Է� : ");
			int sco = sc.nextInt();
			
			if(sco<0) {
				break;
			}
			
			sum+=sco;
			i++;
		}
		System.out.println("���� : "+ sum);
		System.out.printf("��� : %f\n",(double)sum/i);
		
		
		
//		do {
//			System.out.print("���� �Է�: ");
//			int sco = sc.nextInt();
//			
//			if(sco<0) {
//				break;
//			}
//			
//			sum+=sco;
//			i++;
//			
//			
//		} while(true);
//		
//		System.out.println("���� : "+ sum);
//		System.out.printf("��� : %f\n",(double)sum/i);
	}

}
