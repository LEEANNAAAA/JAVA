package Wen;

import java.util.Scanner;

abstract public class Calc {

	int a;
	int b;

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	abstract public int calculate();

	public static void menu() {
		System.out.println("1.ADD | 2.SUBSTRACT | 3. MUTIPLY | 4. DIVIDE | 5. END");
	}
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean run = true;
		
		while (run) {
			
			menu();
			
			int c = sc.nextInt();

			if(c==5) {
				System.out.println("종료");
				break;
			}
			
			if(c<1 || c>5) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			
			System.out.print("숫자1 입력: ");
			int a = sc.nextInt();
			
			System.out.print("숫자2 입력: ");
			int b = sc.nextInt();

			int result = 0;
			
			Calc cal = null;
			
			switch (c) {
			case 1:
				cal = new Add();
				break;

			case 2:
				cal = new Sub();
				break;

			case 3:
				cal = new Mul();
				break;

			case 4:
				cal = new Div();
				break;
				
			}
			
			cal.setValue(a, b);
			result = cal.calculate();
			System.out.println("result: "+result);
		}
		
	}
}
