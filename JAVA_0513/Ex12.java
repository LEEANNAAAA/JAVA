import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
// �Է¹��� �ϳ��� ���ڰ� ���ĺ� �빮���̸� 1�� �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.		

		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0); // �����ϳ� �Է�, (0)�� �ε����� �� ù��° ���� ����

		if (ch >= 65 && ch <= 90) {	
			//  �Ǵ� (ch='A' && ch<='Z') ������ ��Ȯ�ϰ� �����־�� �Ѵ�. 
			//	if������ ���̸� ���� else�� �Ѿ�� �ʴ´�.
			//  ���� ch>=65�� �ع����� 'a'�� �Է��ϸ� �̹� if������ �����ϱ� ������ 0�� ��µ��� �ʴ´�.
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}

