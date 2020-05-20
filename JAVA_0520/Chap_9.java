import java.util.Scanner;

public class Chap_9 {

	public static void main(String[] args) {

		// 임의의 양의 정수를 반복 입력받아 그 중에 전체 짝수의 개수를 출력하는 프로그램을 작성

		Scanner sc = new Scanner(System.in);

		System.out.println((0%2));
		
		int num;
		int cnt = 0;	//누적합은 무조건 0 으로 초기화

		for (;;) {
			System.out.println("양의 정수를 입력하시오.(나가기(음수입력)): ");
			num = sc.nextInt();

			if (num <= 0) {
				break;
			}

			if (num % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("전체 짝수의 개수 : " + cnt);
		
		
//		Scanner sc = new Scanner(System.in);
//		int cnt=0;
//		
//		while (true) {
//			System.out.println("정수입력 : ");
//			int num = sc.nextInt();
//
//			if (num <= 0) {
//				break;
//			}
//			if (num % 2 == 0) {
//				cnt++;
//
//			}
//		}
//		System.out.println("짝수의 개수" + cnt);
	}
}
