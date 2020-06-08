import java.util.Scanner;

public class MyExp {
	
	//두 개의 정수형 멤버 필드 base 와 exp
	//2의 3승이면 base 2 , exp 3 (양의 정수만을 가지는 것으로 가정)
	//MyExp는 정수값을 리턴하는 getValue()라는 메소드를 제공
	//getValue()는 base와 exp 값으로부터 지수를 계산하여 정수 값으로 리턴
	
	int base;
	int exp;
	
	public MyExp(int x,int y) {	//생성자
		base = x;
		exp = y;
	}
	
	public int getValue() {
		int fact = 1;
		for (int i = 0; i < exp; i++) {
			fact *= base;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("밑의 값은?");
		int a = sc.nextInt(); 
		System.out.println("지수의 값은?");
		int b = sc.nextInt(); 
		MyExp ok = new MyExp(a,b);
		
		System.out.printf("%d의 %d승은 %d입니다.",a,b,ok.getValue());
	}
}
