package may_0525;

import java.util.Scanner;

public class Chap_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add = test(10, 80);
		System.out.printf("합의 결과 : %d", add);
	}

	public static int test(int x, int y) {
		return x + y;	//return을 만나면 바로 그 자리에서 종료(맨 마지막에 무조건 사용하는 것 아님)
	}
}
