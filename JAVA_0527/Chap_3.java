package may_0527;

import java.util.Scanner;

public class Chap_3 {

	public static void main(String[] args) {
		// 점수 5개 입력받아서 저장하고 전체 총 합을 구하고 평균 구하기

		Scanner sc = new Scanner(System.in);

		int[] sco;
		sco = new int[5];
		// int[] sco = new int[5] 는 쓸 수 없는 문법
		int i;

		for (i = 0; i < sco.length; i++) {
			System.out.printf("%d번째 점수 입력 : ", i + 1);
			sco[i] = sc.nextInt();
		}

		int sum = 0;
		for (i = 0; i < sco.length; i++) {
			sum += sco[i];
		}
		double avg = (double) sum / sco.length;

		System.out.println("전체 합 : " + sum);
		System.out.printf("전체 평균 점수 : %.2f\n", avg);
		
	}
}
