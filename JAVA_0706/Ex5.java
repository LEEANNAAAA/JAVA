import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		String str = "  �ѱ�  ABCD efgh  ";
		
//		System.out.println("�� ���ڿ�==>["+str+"]");
//		System.out.println("�빮�ڷ�==>["+str.toUpperCase()+"]");
//		System.out.println("�ҹ��ڷ�==>["+str.toLowerCase()+"]");
//		System.out.println("��������==>["+str.trim()+"]");
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				result += str.charAt(i);
			}
		}
		System.out.println("�� ���ڿ� ==>["+str+"]");
		System.out.println("�������� ==>["+result+"]");
	}
}
