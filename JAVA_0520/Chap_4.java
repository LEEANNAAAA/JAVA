import java.util.Scanner;

public class Chap_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		do {
			System.out.println("1.���Ͽ���");
			System.out.println("2.��������");
			System.out.print("�޴� ���� >> ");
			menu = sc.nextInt();
			
		}while(menu <1||menu>2);
	}

}
