import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//������ ���� x,y,z�� �Է¹޾� �ִ밪 ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �Է� >> ");
		int x = sc.nextInt();
		System.out.println("�ι�° ���� �Է� >> ");
		int y = sc.nextInt();
		System.out.println("����° ���� �Է� >> ");
		int z = sc.nextInt();

		
		int max;
		
		max = (x>=y && x>=z) ? x : (y>=z? y : z);
		System.out.printf("�ִ밪:%d\n",max);
		
		
		
//		int max;
//		int max2;
//		
//		max = x>y ? x : y;
//		max2 = max>z ? max : z;
//		System.out.printf("�ִ밪:%d\n",max2);
		
		
	
		
	}
}
