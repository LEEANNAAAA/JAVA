package Example;

import java.util.Scanner;

public class Chap_12 {

	public static void main(String[] args) {
		int a,b; // �����̱� ������ �Ҽ��� x
		int result;
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt(); // ������ ���� �Է¹޴´�
		b = s.nextInt();
		
		result = a+b;
		System.out.println(a+"+"+b+"="+result);
		
		result = a-b;
		System.out.println(a+"-"+b+"="+result);
		
		result = a*b;
		System.out.println(a+"*"+b+"="+result);
		
		result = a/b;
		System.out.println(a+"/"+b+"="+result);
		
		
	}
	

}
