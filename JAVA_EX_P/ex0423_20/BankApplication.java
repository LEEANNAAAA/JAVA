package ex0423_20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100]; //account��ü�� ���� �� ������ �� �ִ� Ÿ�� > array
	private static Scanner scanner = new Scanner(System.in); //system.in > Ű���� �Է��� ���� �� �ְ�, Scanner > ctrl+shift+o > import��

	public static void main(String[] args) {
		boolean  run = true; //�������� , while���� false�϶� �������� �� �ְ� �ϱ� ���ؼ�
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("--------------------------------------------------");
			System.out.println("����> ");
			
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
		System.out.println("���α׷� ����");
	}
	
	private static void createAccount() { // ���� �޼ҵ�
		System.out.println("-------------------");
		System.out.println("���»���");
		System.out.println("-------------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();		// ���ڿ��̱� ������ next
		
		System.out.print("������: ");
		String owner = scanner.next();	
		
		System.out.print("�ʱ��Աݾ�: ");
		int balance = scanner.nextInt();	
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] == null) {  //����ִ� ���ΰ�?
				accountArray[i] = newAccount; //����ִ� ���̴� newAccount�� ����ְڴ�
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}
	private static void accountList() {
		
		System.out.println("-------------------");
		System.out.println("���¸��");
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
		System.out.println("����");
		System.out.println("--------------------------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next(); //����ڰ� �Է��� ���� ���ڿ�
		System.out.print("���ݾ�: ");
		int money = scanner.nextInt(); // ���� nextInt
		
		Account account = findAccount1(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("���: �Ա��� �����Ǿ����ϴ�.");
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
		System.out.println("���");
		System.out.println("--------------------------");
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next(); //����ڰ� �Է��� ���� ���ڿ�
		System.out.print("��ݾ�: ");
		int money = scanner.nextInt(); // ���� nextInt
		
		Account account = findAccount1(ano);
		if(account == null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()+money);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
}
	
	
	
	
	
}


