import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// ö�а����� �߰���� ������ ��ü ��������� ���Ͻÿ�
		// ���ѷ��� ���¿��� �߰���� ������ �Է¹޾� ��ü���� ���Ѵ�.
		// ���ѷ����� ���������� ���� �ǵ������� ������ ������ �Է��Ѵ�.
		// �л� ���� �� �� ����

		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int cnt = 0;
		int score;
		int sum = 0;
		
		while(true) {
			System.out.printf("%d�� �л� ���� : ",i++);
			score = sc.nextInt();
			
			if(score<0) {
				break;
			}
			sum += score;
			cnt++;
		}
		double avg = (double)sum/(cnt);
		System.out.printf("ö�а��� ��ü �������:%.2f\n",avg);
	}
}