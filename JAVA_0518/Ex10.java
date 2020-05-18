import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// 철학과목의 중간고사 점수의 전체 평균점수를 구하시오
		// 무한루프 상태에서 중간고사 점수를 입력받아 전체합을 구한다.
		// 무한루프를 빠져나오기 위해 의도적으로 점수를 음수로 입력한다.
		// 학생 수는 알 수 없음

		Scanner sc = new Scanner(System.in);

		int num = 1;
		int sum = 0;

		while (true) {
			System.out.print("철학과목 점수 입력>> ");
			int phil = sc.nextInt();

			if (phil >= 0) {
				sum += phil;
				System.out.println(num+"번 학생 점수 : "+sum);
			} else {
				break;
			}
			num++;
		}
		
		System.out.println("철학 과목 전체 합 점수 : " + sum);
		
		int avg = sum / (num - 1);
		System.out.println("철학 과목 전체 평균점수 : " + avg);
	}
}