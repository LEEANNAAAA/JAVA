import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// ������ ��� Ư�������� 4�� �������� �� ������������� 100���δ� ������ �������� �ʴ´�. Ȥ�� 400���� ������ �������� ������ ������ �ȴ�.
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� >> ");
		int year = sc.nextInt();
		
//		boolean bool;
//		
//		bool = (year%4==0 && year%100!=0) || year%400==0;
//		System.out.println(bool);
		
		
		boolean bool = (year%4==0 && year%100!=0) || year%400==0;
		System.out.println(bool);
		


		
	}

}
