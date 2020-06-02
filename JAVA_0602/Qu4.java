import java.util.Scanner;

public class Qu4 {
//next or nextLine > 5개 단어의 입력을 받아 연결
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] str = new String[5];
		String sum = "";

		for (int i = 0; i < str.length; i++) {
			System.out.printf("%d번째 입력: ",i+1);
			str[i] = sc.nextLine();
		}
		for (String n: str) {
			sum += n;
		}
		System.out.println();
		System.out.printf("연결문장: %s\n", sum);
	}
}
