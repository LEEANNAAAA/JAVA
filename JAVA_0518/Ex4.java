import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" [[MENU]] ");
		System.out.println("1. «��");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ�����");
		System.out.println("4. Į����");
		
		System.out.print("�޴� ����>> ");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1: 
			System.out.println("«�� ����~");
			break;
		case 2: 
			System.out.println("���� ����~");
			break;
		case 3: 
			System.out.println("��ȸ����� ����~");
			break;
		case 4: 
			System.out.println("Į���� ����~");
			break;
		default:
			System.out.println("�������� �ʴ� �׸��Դϴ�. �ٽ� �Է����ּ���");
			break;	
		}
		
}
	
}