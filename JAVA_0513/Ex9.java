import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("분자를 입력하세요");
		int a = sc.nextInt();
		System.out.println("분모를 입력하세요");
		int b = sc.nextInt();
		String result = a + "/" + b;

		if (b == 0) {
			System.out.println("입력오류");
			System.out.println("0은 분모로 사용 불가");
		} else {
			System.out.println("result: " + result);
		}
		
		
		

		
		

	}
}
