import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("�и� �Է��ϼ���");
		int b = sc.nextInt();
		String result = a + "/" + b;

		if (b == 0) {
			System.out.println("�Է¿���");
			System.out.println("0�� �и�� ��� �Ұ�");
		} else {
			System.out.println("result: " + result);
		}
		
		
		

		
		

	}
}
