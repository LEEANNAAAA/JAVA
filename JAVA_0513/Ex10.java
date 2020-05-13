import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
//		System.out.println("당신의 국적은 (KOREA(1)/ETC(2))?");
//		int a = sc.nextInt();
//
//		String x;
//		String y;
//
//		if (a == 1) {
//			x = "한국";
//		} else if (a == 2) {
//			x = "외국";
//		} else {
//			return;
//		}
//
//		System.out.println("당신의 성별은 (MALE(3)/FEMALE(4))?");
//		int b = sc.nextInt();
//
//		if (b == 3) {
//			y = "남성";
//		} else if (b == 4) {
//			y = "여성";
//		} else {
//			return;
//		}
//
//		System.out.println("당신은 " + x + " " + y + " 입니다.");
		
		final int KOR = 1;
		final int ETC = 2;
		final int MALE = 3;
		final int FEMALE = 4;
		
		System.out.println("당신의 국적은 (KOREA(1)/ETC(2))?");
		int country = sc.nextInt();
		
		System.out.println("당신의 성별은 (MALE(3)/FEMALE(4))?");
		int gender = sc.nextInt();
		
		if(country==KOR) {
			if(gender==MALE) {
				System.out.println("당신은 한국 남성입니다.");
			} else {
				System.out.println("당신은 한국 여성입니다.");
			}
		} else {
			if(gender==MALE) {
				System.out.println("당신은 한국 남성입니다.");
			} else {
				System.out.println("당신은 한국 여성입니다.");
			}
		}
		
 
	}
}
