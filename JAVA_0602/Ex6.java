import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		
		int sum = 0;
		
		for(int n: arr) {	//������ ���� n���� �ش�(�˾Ƽ� �������), for������ �Ϲ������� �迭���� ���� ���
			sum+=n;
		}
		System.out.printf("��ü��:%d\n",sum);
	}
}
