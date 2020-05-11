package kr.ac.kopo.exapp;

import java.util.Scanner;

public class ExLogin {
	// "ID를 입력하세요" 라고 출력하고, ID를 입력받고,
	// "비밀번호를 입력하세요" 라고 출력하고, 비밀번호를 입력받고,
	// 입력한 ID가 "a001"이 아니면, "존재하지 않는 ID입니다" 라고 출력
	// 입력한 ID가 "a001"이고 비밀번호가 "1234"이면, "로그인 성공" 이라고 출력
	// 입력한 ID가 "a001"이고 비밀번호가 "1234"가 아니면, "로그인 실패" 라고 출력

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ID를 입력하세요");
		String ID = sc.nextLine();

		// 문자열 내용 비교는 equals 메서드를 사용
//		if(ID.equals("a001")==false) { //!ID.equals("a001") 랑 동일  > ! 주의!!
//			System.out.println("존재하지 않는 ID입니다");
//		}  else if(ID.equals("a001") && PWD.equals("1234")) {
//			System.out.println("로그인 성공");
//		}	else {
//			System.out.println("로그인 실패");
//		}
//		
		if (ID.equals("a001")) {

			System.out.println("비밀번호를 입력하세요");
			String PWD = sc.nextLine();

			if (PWD.equals("1234")) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패");
			}
		}

		else {
			System.out.println("존재하지 않는 ID입니다");
		}

	}

}
