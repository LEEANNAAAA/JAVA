package ex0423_20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; //account객체를 여러 개 저장할 수 있는 타입 > array
	private static Scanner scanner = new Scanner(System.in); //system.in > 키보드 입력을 읽을 수 있게, Scanner > ctrl+shift+o > import문

	public static void main(String[] args) {
		boolean  run = true; //지역변수 , while문이 false일때 빠져나갈 수 있게 하기 위해서
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			} else if(selectNo == 2) {
				accountList();
			} else if(selectNo == 3) {
				deposit();
			} else if(selectNo == 4) {
				withdraw();
			} else if(selectNo == 5) {
				run=false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() { // 정적 메소드
		System.out.println("-------------------");
		System.out.println("계좌생성");
		System.out.println("-------------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();		// 문자열이기 때문에 next
		
		System.out.print("계좌주: ");
		String owner = scanner.next();	
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();	
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {  //비어있는 곳인가?
				accountArray[i] = newAccount; //비어있는 곳이니 newAccount를 집어넣겠다
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
		
	}
	private static void accountList() {
		
		System.out.println("-------------------");
		System.out.println("계좌목록");
		System.out.println("-------------------");
		
		for(int i=0;i<accountArray.length;i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("            ");
				System.out.print(account.getOwner());
				System.out.print("            ");
				System.out.print(account.getBalance());
				System.out.println();
			}
			}
		
	}
	private static void deposit() {
		System.out.println("--------------------------");
		System.out.println("예금");
		System.out.println("--------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next(); //사용자가 입력한 정보 문자열
		System.out.print("예금액: ");
		int money = scanner.nextInt(); // 정수 nextInt
		
		Account account = findAccount1(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("결과: 입금이 성공되었습니다.");
}
	
	private static Account findAccount1(String ano) {
		Account account = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.contentEquals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}
	
	
	private static void withdraw() { 
		System.out.println("--------------------------");
		System.out.println("출금");
		System.out.println("--------------------------");
		System.out.print("계좌번호: ");
		String ano = scanner.next(); //사용자가 입력한 정보 문자열
		System.out.print("출금액: ");
		int money = scanner.nextInt(); // 정수 nextInt
		
		Account account = findAccount1(ano);
		if(account == null) {
			System.out.println("결과: 계좌가 없습니다.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("결과: 출금이 성공되었습니다.");
}
	
	
	
	
	
}


