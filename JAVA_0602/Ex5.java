import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int[] brr = new int[10];
		
		System.arraycopy(arr, 0, brr, 3, arr.length); 
//		System.arraycopy(arr, 2, brr, 3, 3); //�ε��� ���� �����־�� ��
//		�迭, ���� �迭�� ������ġ, �� �迭, ���� �ٿ����� ��ġ, ����
	
		for (int i = 0; i < brr.length; i++) {
			System.out.printf("%4d",brr[i]);
		}
	}
}
