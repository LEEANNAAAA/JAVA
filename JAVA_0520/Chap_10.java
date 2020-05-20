import java.util.Scanner;

public class Chap_10 {

	public static void main(String[] args) {
		// 입력한 모든 정수 값들에 대하여 1부터 그 정수까지의 누적 승을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		int i;
		int num;
		int mul = 1;

		while (true) {

			System.out.println("임의의 정수를 입력하시오");
			num = sc.nextInt();

			System.out.println("----------------------------");
			System.out.println("n\t1부터 n까지의 곱");
//			System.out.printf("%5s%30s\n","n","1부터 n까지의 곱");
			System.out.println("----------------------------");

			mul = 1;
			for (i = 1; i <= num; i++) {
//				System.out.printf("%5d%30d\n",i,mul=mul*i);
				mul *= i;
				System.out.println(i + "\t" + mul);
			}

			System.out.println("계속 하시겠습니까?(y/n)");
			sc.nextLine();
			char ans = sc.nextLine().charAt(0);

			if (ans == 'n') {
				System.out.println("종료");
				break;
			}
		}

	}
}
