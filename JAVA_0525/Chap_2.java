package may_0525;

import java.util.Scanner;

public class Chap_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int add = test(10, 80);
		System.out.printf("���� ��� : %d", add);
	}

	public static int test(int x, int y) {
		return x + y;	//return�� ������ �ٷ� �� �ڸ����� ����(�� �������� ������ ����ϴ� �� �ƴ�)
	}
}
