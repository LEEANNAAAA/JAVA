package Example;

import java.util.Scanner;

public class Chap_12 {

	public static void main(String[] args) {
		int a,b; // 정수이기 때문에 소수점 x
		int result;
		
		Scanner s = new Scanner(System.in);
		a = s.nextInt(); // 정수형 값을 입력받는다
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
