import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//		int[][] arr = new int[2][3];
//		int[][] arr = {{10,20},{30,40},{50,60}};

		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%dÇà: ", i + 1);
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%5d", arr[i][j]);
			}
			System.out.println();
		} 

	}
}
