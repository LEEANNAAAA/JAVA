package may_0525;

import java.util.Scanner;

public class Chap_6 {
	public static void main(String[] args) {
//물리과목 점수를 5개 입력받고 평균점수 구하기
		Scanner sc = new Scanner(System.in);

		int[] sco;
		sco = new int[5];

		for (int i = 0; i < sco.length; i++) {
			System.out.printf("%d번 점수 입력 : ", i + 1);
			sco[i] = sc.nextInt();
		}
		for (int i = 0; i < sco.length; i++) {
			System.out.printf("%4d점", sco[i]);
		}

		int sum = 0;
		for (int i = 0; i < sco.length; i++) {
			sum += sco[i];
		}

		System.out.printf("\n전체 점수 합 : %d점\n", sum);

		double avg = (double) sum / sco.length;
		System.out.printf("전체 평균점수 : %.2f점", avg);
	}

}
