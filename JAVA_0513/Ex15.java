import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요");
		char ch = sc.nextLine().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("알파벳 대문자 출력");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("알파벳 소문자 출력");
		} else if (ch >= '1' && ch <= '9') {
			System.out.println("숫자 출력");
		} else {
			System.out.println("기타문자 출력");
		}

	}
}
