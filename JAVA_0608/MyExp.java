import java.util.Scanner;

public class MyExp {
	
	//�� ���� ������ ��� �ʵ� base �� exp
	//2�� 3���̸� base 2 , exp 3 (���� �������� ������ ������ ����)
	//MyExp�� �������� �����ϴ� getValue()��� �޼ҵ带 ����
	//getValue()�� base�� exp �����κ��� ������ ����Ͽ� ���� ������ ����
	
	int base;
	int exp;
	
	public MyExp(int x,int y) {	//������
		base = x;
		exp = y;
	}
	
	public int getValue() {
		int fact = 1;
		for (int i = 0; i < exp; i++) {
			fact *= base;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ����?");
		int a = sc.nextInt(); 
		System.out.println("������ ����?");
		int b = sc.nextInt(); 
		MyExp ok = new MyExp(a,b);
		
		System.out.printf("%d�� %d���� %d�Դϴ�.",a,b,ok.getValue());
	}
}
