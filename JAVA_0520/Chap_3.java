import java.util.Scanner;

public class Chap_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int sum=0;
		double avg;
		
		while(true) {
			System.out.print("Á¡¼öÀÔ·Â : ");
			int sco = sc.nextInt();
			
			if(sco<0) {
				break;
			}
			
			sum+=sco;
			i++;
		}
		System.out.println("ÃÑÇÕ : "+ sum);
		System.out.printf("Æò±Õ : %f\n",(double)sum/i);
		
		
		
//		do {
//			System.out.print("Á¡¼ö ÀÔ·Â: ");
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
//		System.out.println("ÃÑÇÕ : "+ sum);
//		System.out.printf("Æò±Õ : %f\n",(double)sum/i);
	}

}
