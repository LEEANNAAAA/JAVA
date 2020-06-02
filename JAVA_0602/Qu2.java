public class Qu2 {
//3행3열, 0-100사이 난수, 대각선 합, 각 행의 최대값 출력
	public static void main(String[] args) {

// 각 행의 최대값 출력
		int[][] arr = new int[3][3];
		int sum = 0;
		int i, j;

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 101);
			}
		}

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 0; i < arr.length; i++) {
			int m = 0;
//			int m=arr[0][0];
			for (j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > arr[i][m]) {
					m = j;
				}
//				if(arr[i][j]>m) {
//					m =arr[i][j];
//				}
			}
			System.out.printf("%d행의 최대값 : %d", i+1,arr[i][m]);
//			System.out.printf("%d", m);
			System.out.println();
		}

		
		
		
		
		
		
// 대각선의 합		
//		int[][] arr = new int[3][3];
//		int sum = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (int)(Math.random()*100);
//			}
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.printf("%4d", arr[i][j]);
//				if(i==j) {
//					sum += arr[i][j];
//				}
//			}
//			System.out.println();
//		}
//		System.out.println();
//		System.out.printf("합계: %d",sum);
		
		
		
		
		
		
		
//대각 선 합, 각 행의 최대값 출력 합친 식	
//		int[][] arr = new int[3][3];
//		int i, j;
//
//		
//		for (i = 0; i < arr.length; i++) {
//			for (j = 0; j < arr[i].length; j++) {
//				arr[i][j] = (int)(Math.random()*101);
//			}
//		}
//		
//		int sum=0;
//		int m = arr[0][0];
//		
//		for (i = 0; i < arr.length; i++) {
//			for (j = 0; j < arr[i].length; j++) {
//				System.out.printf("%4d", arr[i][j]);
//
//				if(i==j) {
//					sum += arr[i][j]; 
//				}
//			}
//			System.out.println();
//		}
//		
//		
//		for (i = 0; i < arr.length; i++) {
//			for (j = 0; j < arr[i].length; j++) {
//				
//				if(arr[i][j]>m) {
//					m=arr[i][j];
//				}
//				
//				
//			}
//			System.out.printf("%d행의 최대값 : %d",i+1,m);
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.printf("합 : %d",sum);

	}
}
