package may_0527;

public class Chap_9 {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("���α׷� ����");
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
//			System.out.println("�Ѱܹ��� ���ڿ� �μ��� �����ϴ�!!");
//		} else {
//			System.out.println("���ڿ��� �ֽ��ϴ�.");
//		}
	}
}
