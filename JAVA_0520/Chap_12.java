import java.util.Scanner;

public class Chap_12 {

	public static void main(String[] args) {
		// 10개의 정수를 입력받아 최댓값과 최솟값을 구하시오.
		Scanner sc = new Scanner(System.in);

		int n, min, max;

		System.out.printf("입력%d: ", 1);
		min = max = n = sc.nextInt();

		for (int i = 2; i <= 10; i++) {
			System.out.printf("입력%d", i);
			n = sc.nextInt();

			if (max < n) {
				max = n;
			}
			if (min > n) {
				min = n;
			}
		}
		System.out.printf("최댓값:%d, 최솟값:%d\n", max, min);

//		int i;
//		int num = 0;
//		int max = 0;
//		int min = 0;
//
//		for (i = 1; i <= 10; i++) {
//			System.out.printf("입력%d : ", i);
//			num = sc.nextInt();
//
//			max = (max > num) ? max : num;
//			min = (min < num) ? min : num;
//
//		}
//		
//		System.out.println("최대값" + max);
//		System.out.println("최소값" + min);
		
		
		
		
		
		
		
//Scanner sc = new Scanner(System.in);
//		
//		int num;
//		int max=0, min=0;
//		
//		for(int i=1; i<=10; i++) {
//			System.out.printf("%d 정수 입력 : ",i);
//			num=sc.nextInt();
//			
//			if(max<num) {
//				max=num;
//			}
//			if(min>num) {
//				min=num;
//			}
//			
//		}
//		System.out.printf("최대값 : %d",max);
//		System.out.printf("최소값 : %d",min);

	}
}
