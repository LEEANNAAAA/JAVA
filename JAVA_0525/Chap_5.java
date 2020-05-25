package may_0525;

import java.util.Scanner;

public class Chap_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		#1
//		int[] arr = { 10, 20, 30, 40, 50 };
//
//		for (int i = 0; i < arr.length; i++) {
//			//length에 5라는 값 저장
//			System.out.printf("%5d", arr[i]);
//		}

		int[] a;
		a = new int[5];

		for (int i = 0; i < a.length; i++) {
			System.out.printf("정수%d: ", i + 1);
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.printf("%4d", a[i]);
		}
	}

}
