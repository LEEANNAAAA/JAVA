import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int num = sc.nextInt();

		int sum = 0;
		int i = 1;
		
		while (i <= num) {
			sum += i; // sum = sum+i;
			i++;
		}

		System.out.println("1~" + (i - 1) + " �� : " + sum);
		System.out.printf("��ü�� : %d\n", sum);
		
		
//		while(true) {	 //���� true�� �����ϰ� �Ǹ� ������ ���� �׻� ���̱⿡ ���ѷ��� ���°� �ȴ�.
//			System.out.println("Hello~");
//		}
		
		
	}
}
