import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";

		System.out.println("원 문자열==> [" + str1 + "]");
		System.out.println("원 문자열==> [" + str2 + "]");
		
		System.out.println(str1.compareTo(str2)); //str1이 기준 > 아스키 코드 P(80)-I(73) = 7
		System.out.println(str1.contains("Java"));
	}
}
