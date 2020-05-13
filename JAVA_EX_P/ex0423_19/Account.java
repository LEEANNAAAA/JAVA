package ex0423_19;

public class Account {
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	
	private int balance;


	public int getBalance() {
		return balance; //getter는 필드의 값을 그대로 return
	}


	public void setBalance(int balance) { //setter는 외부에서 값을 받아서 저장
		if(balance<Account.MIN_BALANCE || //음수
			balance>Account.MAX_BALANCE) {
				return; //메소드 끝
			}
			this.balance = balance; //false 의 경우 > 매개변수 대입
	}
	
	
}
