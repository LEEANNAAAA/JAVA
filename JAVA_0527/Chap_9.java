package may_0527;

public class Chap_9 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("프로그램 사용법");
			System.out.println("java Chap_9 num1 num2");
			System.exit(0);
		}

		int n = Integer.parseInt(args[0]);
		int n1 = Integer.parseInt(args[1]);

		System.out.println(n + " + " + n1 + " = " + (n + n1));

//		int[] a = {};
//		
//		System.out.println(args.length);
//		
//		if (args.length == 0) {
//			System.out.println("넘겨받은 문자열 인수가 없습니다!!");
//		} else {
//			System.out.println("문자열이 있습니다.");
//		}
	}
}
