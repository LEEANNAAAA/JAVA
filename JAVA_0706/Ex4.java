import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str, strRep, strSub, strAry[]; 
		//�Է¹��� ���ڿ�, �ٲ� ���ڿ�, �Ϻ� ���ڿ�, �и��� ���ڿ� �迭�� ����
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = sc.nextLine();
		
		strRep = str.replace(" ", "$");
		strSub = str.substring(2,8);
		strAry = str.split(" ");
		
		System.out.println(strRep);
		System.out.println(strSub);
		
		for (int i = 0; i < strAry.length; i++) {
			System.out.println(strAry[i]);
		}
	}
}
