import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			}
		System.out.println();
		
		arr[0] = new int[3];
		arr[1] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}

	}
}
