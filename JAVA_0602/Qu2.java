public class Qu2 {
//3��3��, 0-100���� ����, �밢�� ��, �� ���� �ִ밪 ���
	public static void main(String[] args) {

// �� ���� �ִ밪 ���
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
			System.out.printf("%d���� �ִ밪 : %d", i+1,arr[i][m]);
//			System.out.printf("%d", m);
			System.out.println();
		}

		
		
		
		
		
		
// �밢���� ��		
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
//		System.out.printf("�հ�: %d",sum);
		
		
		
		
		
		
		
//�밢 �� ��, �� ���� �ִ밪 ��� ��ģ ��	
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
//			System.out.printf("%d���� �ִ밪 : %d",i+1,m);
//			System.out.println();
//		}
//		
//		System.out.println();
//		System.out.printf("�� : %d",sum);

	}
}
