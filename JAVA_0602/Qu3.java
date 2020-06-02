import java.util.Scanner;

public class Qu3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int i, j;
		int sum = 0;
		int num = 0;

		for (i = 0; i < arr.length - 1; i++) {
			System.out.printf("%d행 입력: ", i + 1);
			for (j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
//			arr[3][3]+=arr[i][3];
		}
//		for (int k = 0; k < arr[i].length - 1; k++) {
//			sum += arr[3][k];
//		}
//		arr[3][3] = sum;

		System.out.println("\t[결과]");
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		}
	}
}
