import java.util.Scanner;

public class Qu4 {
//next or nextLine > 5�� �ܾ��� �Է��� �޾� ����
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] str = new String[5];
		String sum = "";

		for (int i = 0; i < str.length; i++) {
			System.out.printf("%d��° �Է�: ",i+1);
			str[i] = sc.nextLine();
		}
		for (String n: str) {
			sum += n;
		}
		System.out.println();
		System.out.printf("���Ṯ��: %s\n", sum);
	}
}
