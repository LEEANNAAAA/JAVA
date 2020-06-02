import java.util.Scanner;

public class Qu1 {
//3행4열, 맨 마직막 열에는 각 행의 합
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d행: ", i + 1);
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}

//		for (int i = 0; i < arr.length; i++) {
//			System.out.printf("%d행: ", i + 1);
//			System.out.println();
//			for (int j = 0; j < arr[i].length; j++) {
//				if (j == 3) {
//					sum = arr[i][0] + arr[i][1] + arr[i][2];
//					arr[i][3] = sum;
//				} else {
//					arr[i][j] = sc.nextInt();
//				}
//			}
//		}
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.printf("%5d", arr[i][j]);
//			}
//			System.out.println();
//		}

	}
}
