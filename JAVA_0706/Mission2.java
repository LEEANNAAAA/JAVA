import java.util.Scanner;

public class Mission2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		int upplow = 0;
		String result = "";
		
		
		for (int i = 0; i < str.length(); i++) {
			
			upplow = str.charAt(i);	//�ƽ�Ű�ڵ� int ���ص� ��
			
			if(upplow>=65 && upplow<=90 ) {
				System.out.printf("%c",upplow+32);
			} else if(upplow>=97 && upplow<=122) {
				System.out.printf("%c",upplow-32);
			} else {
				System.out.printf("%c",upplow);
			}
		}

//		System.out.println("��ȯ�� ���ڿ� : "+result);
	}
}
