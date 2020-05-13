package ex0423_19;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(-100); // 잘못된 잔고가 들어와서 10000원 그대로 유지
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000); // 잘못된 잔고가 들어와서 10000원 그대로 유지
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000); //범위 내이므로 300000원이 balance에 대입
		System.out.println("현재 잔고: " + account.getBalance());
	}

}
