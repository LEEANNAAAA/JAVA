import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		int cnt=1;
		
		while(cnt<=5) {
		System.out.println("Hello");
		cnt++;	//�����ϴ� ���� ������ ������ ���� �ݺ��Ѵ�.
	}
		
//		while(mul<=9) {
//			System.out.println("7 x "+mul+" = "+(7*mul));
//			mul++;
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է����ּ���");
		int input = sc.nextInt();
		
		int mul=1;
		while(mul<=9) {
			System.out.printf(" %d x %d = %d\n", input, mul, input*mul);
			mul++;
		}
		
		
}
}
