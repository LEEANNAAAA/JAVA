import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է����ּ���>> ");
		int year = sc.nextInt();
		System.out.print("���� �Է����ּ���>> ");
		int month = sc.nextInt();
		int days;
		
		switch(month) {
		case 2: 
			if((year%4==0 && year%100!=0)||year%400==0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 4: case 6: case 9: case 11: days = 30;
			break;
		default: days = 31;
			break;
		}
		System.out.printf("%d�� %d���� %d�ϱ��� �ֽ��ϴ�.", year, month, days);
}
	
}