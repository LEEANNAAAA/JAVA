package ex0423_19;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	
	private int balance;


	public int getBalance() {
		return balance; //getter�� �ʵ��� ���� �״�� return
	}


	public void setBalance(int balance) { //setter�� �ܺο��� ���� �޾Ƽ� ����
		if(balance<Account.MIN_BALANCE || //����
			balance>Account.MAX_BALANCE) {
				return; //�޼ҵ� ��
			}
			this.balance = balance; //false �� ��� > �Ű����� ����
	}
	
	
}
