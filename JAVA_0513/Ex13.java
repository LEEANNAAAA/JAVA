import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
// 키와 몸무게를 입력받아, 정상인지 비만인지 출력하는 프로그램을 작성
// 키에 따른 표준 체중을 구하는 방법은 신장(키)에서 100을 빼고 그 값에 0.9를 곱하여 표준체중을 구하면 된다.

		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요");
		double h = sc.nextInt();
		System.out.println("몸무게를 입력하세요");
		double w = sc.nextInt();

		double bw = (h - 100) * 0.9;

		if (w > bw) {
			System.out.println("과체중");
		} else if (w >= bw - 5 && w <= bw + 5) {
			System.out.println("표준");
		} else {
			System.out.println("저체중");
		}

	}
}
