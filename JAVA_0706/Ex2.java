import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("���ڿ� �Է� ==>");
		str = sc.nextLine();
		
		System.out.println("��� ���ڿ� ==>");
		
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i)=='o') {
//				System.out.printf("%c",'$');
//			} else {
//				System.out.printf("%c",str.charAt(i));
//			}
//		}
		
		
		if(!str.startsWith("(")){
			System.out.print("(");
		} 
		
		for (int i = 0; i < str.length(); i++) {	//�迭�� �ƴ϶� �޼ҵ带 �������� �� �׷��� ()�ʿ�
			System.out.printf("%c", str.charAt(i));
		}
		
		if(!str.endsWith(")")){
			System.out.print(")");
		} 
		
	}
}
