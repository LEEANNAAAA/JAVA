import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {

		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";

		System.out.println("�� ���ڿ�==> [" + str1 + "]");
		System.out.println("�� ���ڿ�==> [" + str2 + "]");
		
		System.out.println(str1.compareTo(str2)); //str1�� ���� > �ƽ�Ű �ڵ� P(80)-I(73) = 7
		System.out.println(str1.contains("Java"));
	}
}
