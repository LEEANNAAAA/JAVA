package ex0423_20;

public class Account { //하나의 계좌 정보를 담고있는 클래스
	private String ano; //계좌번호 > 외부에서 접근 못함
	private String owner; //계좌주
	private int balance;
	
	public Account(String ano, String owner, int balance) { //생성자, 외부에서 값을 받아서 필드에 저장
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
