import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int sco = sc.nextInt();

//		if (sco >= 90) {
//			System.out.println("A");
//		} else if (sco >= 80) {
//			System.out.println("B");
//		} else if (sco >= 70) {
//			System.out.println("C");
//		} else if (sco >= 60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//		}

		
		char grd;
		
		if (sco >= 90) {
			grd='A';
		} else if (sco >= 80) {
			grd='B';
		} else if (sco >= 70) {
			grd='C';
		} else if (sco >= 60) {
			grd='D';
		} else {
			grd='F';
		}

	}
}
