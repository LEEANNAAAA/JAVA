package kr.ac.kopo.exapp;

import java.util.Scanner;

public class ExCalc {
	// "첫번째 숫자를 입력하세요"라고 출력하고 숫자를 입력받고,
	// "두번째 숫자를 입력하세요"라고 출력하고 숫자를 입력받고,
	// "연산자를 입력하세요( +, -, *, /)"라고 출력하고 연산자를 입력받고,
	// 첫번째입력한숫자 입력한연산자 두번째입력한숫자 = 연산결과
	// 를 출력하도록 프로그램을 작성하세요.
	// +, -, *, / 가 아닌 연산자를 입력한 경우,
	// "알 수 없는 연산자"를 출력하도록 프로그램을 작성하세요.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		String input1 = sc.nextLine();
		System.out.println("두번째 숫자를 입력하세요");
		String input2 = sc.nextLine();

		System.out.println("연산자를 입력하세요(+,-,*,/)");
		String calc = sc.nextLine();

		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);

		int result = 0; // 한번은 초기값을 선언해 줘야 한다.

		if (calc.equals("+")) {
			result = num1 + num2; // result 이름을 동일하게 하고 싶으면 한번만 선언
			System.out.println(num1 + "+" + num2 + "=" + result);
		} else if (calc.equals("-")) {
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
		} else if (calc.equals("*")) {
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
		} else if (calc.equals("/")) {
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
		} else {
			System.out.println("알 수 없는 연산자");
		}

//		int result=0;
//		
//		switch (calc) {
//		case "+":
//			result = num1+num2;
//			break;
//		case "-":
//			result=num1-num2; //result 이름을 동일하게 하고 싶으면 한번만 선언
//			break;
//		case "*":
//			result=num1*num2;
//			break;
//		case "/":
//			result=num1/num2;
//			break;
//		default:
//			System.out.println("알 수 없는 연산자");
//			return; //프로그램 종료, 만약 이후 다른 연산으로 넘어가기 위해서는 변수를 만들어서 해주어야 한다.
//		}
//		System.out.println(num1 + calc + num2 +" = "+ result);
//		
//		
//		
	}

}
