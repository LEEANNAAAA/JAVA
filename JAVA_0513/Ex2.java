import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 윤년은 어느 특정연도를 4롤 나누었을 때 나누어떨어지지만 100으로는 나누어 떨어지지 않는다. 혹은 400으로 나누어 떨어지는 연도는 윤년이 된다.
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("연도 입력 >> ");
		int year = sc.nextInt();
		
//		boolean bool;
//		
//		bool = (year%4==0 && year%100!=0) || year%400==0;
//		System.out.println(bool);
		
		
		boolean bool = (year%4==0 && year%100!=0) || year%400==0;
		System.out.println(bool);
		


		
	}

}
