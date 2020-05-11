package kr.ac.kopo.exapp; //패키지는 클래스 파일이 저장되는 폴더

import java.util.Scanner;

//자바 프로그램은 클래스 단위로 작성하고 실행
public class ExInOut {
	
	//클래스를 실행 == 클래스 내부의 main 메서드(명령어 묶음)에 정의된 명령문들을 순서대로 실행
	public static void main(String[] args) {
		
		//표준입력(키보드)로부터 데이터를 읽을 수 있는 스캐너 객체 생성
//		Scanner sc = new Scanner(System.in);
//		System.out.println("이름을 입력하세요");
//		
//		//엔터키를 입력할 때까지 입력한 문자열을 가져와서 변수 line에 저장
//		String line = sc.nextLine();
//		System.out.println(line);
//		
//		//이름을 입력하세요 라고 출력하고, 
//		//이름을 입력받고, "Hello, 입력한이름"을 출력하는 프로그램을 작성하세요
//		System.out.println("Hello, " + line);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		
		String line = sc.nextLine();
		System.out.println("Hello, " + line);
	}
}
