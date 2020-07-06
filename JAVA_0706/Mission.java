import java.util.Scanner;

public class Mission {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("문자열 입력 : ");
		String str = sc.next();

		String result = "";

		System.out.println("문자열 거꾸로 출력");

		for (int i = str.length() - 1; i > -1; i--) {
			result += str.charAt(i);
		}
		System.out.println(result);

	}
}
