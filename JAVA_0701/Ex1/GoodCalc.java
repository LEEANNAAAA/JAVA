package Ex1;

import java.util.Scanner;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] array) {
		int sum = 0;
		int average = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			average = sum/array.length;
		}
		return average;
	}

	public static void menu() {
		System.out.println("1.ADD | 2.SUBSTRACT | 3.AVERAGE | 4.END");
	}

	public static void main(String[] args) {
		// ����,���� �ǿ����� �ޱ�, ��� ������ ������ �迭���� , �װ�  ���
		int a=0;
		int b=0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			menu();
			int n = sc.nextInt();

			if (n == 4) {
				System.out.println("����");
				break;
			}

			if (n < 1 || n > 4) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				continue;
			}

			if(n==1 || n==2) {
				System.out.println("�ǿ�����1: ");
				a = sc.nextInt();
				System.out.println("�ǿ�����2: ");
				b = sc.nextInt();
			}
			
			Calculator c = null;

			switch (n) {
			
			case 1:
				c = new GoodCalc();
				System.out.println(c.add(a, b)+"\n");
				break;
			case 2:
				c = new GoodCalc();
				System.out.println(c.substract(a, b)+"\n");
				break;
			case 3:
				System.out.println("�迭");
				int i = sc.nextInt();
				int[] array = new int[i];
				for (i = 0; i < array.length; i++) {
					System.out.printf("�ǿ����� %d: ", i);
					int num = sc.nextInt();
					array[i] = num;
				}
				c = new GoodCalc();
				System.out.println(c.average(array)+"\n");
				break;
			}

			
		}

	}
}
