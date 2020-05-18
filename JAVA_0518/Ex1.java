import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 : ");
		int a = sc.nextInt();
		System.out.println("정수를 입력하시오 : ");
		int b = sc.nextInt();
	
		
//		int c = a+b;
//		int d = a-b;
//		int e = b-a;
//		
//		System.out.println("두 수의 합: "+c);
//		
//		if(a>=b) {
//			System.out.println("두 수의 차: "+ d);
//		} else {
//			System.out.println("두 수의 차: "+ e);
		
		
		
		System.out.printf("두 정수의 합 : %d\n", a+b);
		
		if(a>=b) {
			System.out.printf("두 수의 차: %d\n", a-b);
		} else {
			System.out.printf("두 수의 차: %d\n", b-a);
	
		}
		
		
		
		
		

	}

}
