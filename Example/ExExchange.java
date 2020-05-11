package kr.ac.kopo.exapp;

import java.util.Scanner;

public class ExExchange {
	// 1.
	// "달러 금액을 입력하세요."라고 출력하고, 달러금액 입력받고,
	// 1달러 == 1216.90원 환율에 맞춰서 계산하여
	// "????원" 이라고 출력하는 프로그램을 작성하세요.

	// 2.
	// 아래 환율을 사용하여,
	// 현찰 사실때, 현찰 파실때, 송금 보내실때, 송금 받으실때 금액도 출력
	// 현찰 사실때 1,238.19원
	// 현찰 파실때 1,195.61원
	// 송금 보내실때 1,228.80원
	// 송금 받으실때 1,205.00원

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("달러 금액을 입력하세요");
		String money = sc.nextLine();
		
		double num = Double.parseDouble(money);
		double result = num * 1216.90;
		System.out.println(result + "원");
		
		System.out.println("현찰 사실때 "+ (num*1238.19) + "원");
		System.out.println("현찰 파실때 "+ (num*1195.61) + "원");
		System.out.println("송금 보내실때 "+ (num*1228.80) + "원");
		System.out.println("송금 받으실때 "+ (num*1205.00) + "원");
		
		System.out.printf("%.2f 원", result);
		
		
		
		

	}
}
