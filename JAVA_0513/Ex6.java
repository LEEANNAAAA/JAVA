import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� : ");
		int phy = sc.nextInt();
		System.out.println("�������� : ");
		int hist = sc.nextInt();
		System.out.println("ö������ : ");
		int phil = sc.nextInt();

//		String str1 = "���";
//		String str2 = "���� ��ȸ��";
//		
//		if(phy>=70 && hist>=70 && phil >=70) {
//			System.out.println(str1);
//		} else {
//			System.out.println(str2);
//		}

//		String pass1 = phy>=70 && hist>=70 && phil >=70 ? "���" : "���� ��ȸ��";
//		System.out.println(pass1);

		System.out.println(phy >= 70 && hist >= 70 && phil >= 70 ? "���" : "���� ��ȸ��");

//		int x = (phy+hist+phil)/3;
//		if(x>=70) {System.out.println(str1);
//		} else {
//		System.out.println(str2);
//		}

	}
}
