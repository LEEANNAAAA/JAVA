import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		System.out.println("������ �Է��Ͻÿ� : ");
		int b = sc.nextInt();
	
		
//		int c = a+b;
//		int d = a-b;
//		int e = b-a;
//		
//		System.out.println("�� ���� ��: "+c);
//		
//		if(a>=b) {
//			System.out.println("�� ���� ��: "+ d);
//		} else {
//			System.out.println("�� ���� ��: "+ e);
		
		
		
		System.out.printf("�� ������ �� : %d\n", a+b);
		
		if(a>=b) {
			System.out.printf("�� ���� ��: %d\n", a-b);
		} else {
			System.out.printf("�� ���� ��: %d\n", b-a);
	
		}
		
		
		
		
		

	}

}
