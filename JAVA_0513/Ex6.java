import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("물리점수 : ");
		int phy = sc.nextInt();
		System.out.println("역사점수 : ");
		int hist = sc.nextInt();
		System.out.println("철학점수 : ");
		int phil = sc.nextInt();

//		String str1 = "통과";
//		String str2 = "다음 기회에";
//		
//		if(phy>=70 && hist>=70 && phil >=70) {
//			System.out.println(str1);
//		} else {
//			System.out.println(str2);
//		}

//		String pass1 = phy>=70 && hist>=70 && phil >=70 ? "통과" : "다음 기회에";
//		System.out.println(pass1);

		System.out.println(phy >= 70 && hist >= 70 && phil >= 70 ? "통과" : "다음 기회에");

//		int x = (phy+hist+phil)/3;
//		if(x>=70) {System.out.println(str1);
//		} else {
//		System.out.println(str2);
//		}

	}
}
