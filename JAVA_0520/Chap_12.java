import java.util.Scanner;

public class Chap_12 {

	public static void main(String[] args) {
		// 10���� ������ �Է¹޾� �ִ񰪰� �ּڰ��� ���Ͻÿ�.
		Scanner sc = new Scanner(System.in);

		int n, min, max;

		System.out.printf("�Է�%d: ", 1);
		min = max = n = sc.nextInt();

		for (int i = 2; i <= 10; i++) {
			System.out.printf("�Է�%d", i);
			n = sc.nextInt();

			if (max < n) {
				max = n;
			}
			if (min > n) {
				min = n;
			}
		}
		System.out.printf("�ִ�:%d, �ּڰ�:%d\n", max, min);

//		int i;
//		int num = 0;
//		int max = 0;
//		int min = 0;
//
//		for (i = 1; i <= 10; i++) {
//			System.out.printf("�Է�%d : ", i);
//			num = sc.nextInt();
//
//			max = (max > num) ? max : num;
//			min = (min < num) ? min : num;
//
//		}
//		
//		System.out.println("�ִ밪" + max);
//		System.out.println("�ּҰ�" + min);
		
		
		
		
		
		
		
//Scanner sc = new Scanner(System.in);
//		
//		int num;
//		int max=0, min=0;
//		
//		for(int i=1; i<=10; i++) {
//			System.out.printf("%d ���� �Է� : ",i);
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
//		System.out.printf("�ִ밪 : %d",max);
//		System.out.printf("�ּҰ� : %d",min);

	}
}
