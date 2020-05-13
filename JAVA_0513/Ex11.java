import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자");
		int a = sc.nextInt();
		System.out.println("두번째 숫자");
		int b = sc.nextInt();
		System.out.println("세번째 숫자");
		int c = sc.nextInt();

//		if (a >= b && a >= c) {
//			System.out.println("최대값: "+a);
//		} else if (b >= c) {
//			System.out.println("최대값: "+b);
//		} else {
//			System.out.println("최대값: "+c);
//		}
		
		if(a>b) {
			if(a>c) {
				System.out.println("최대값: "+a);
			} else {
				System.out.println("최대값: "+c);
			}
				
		} else {
			 if(b>c) {
				 System.out.println("최대값: "+b);
			 } else {
				 System.out.println("최대값: "+c);
			 }
		
	}
}
}