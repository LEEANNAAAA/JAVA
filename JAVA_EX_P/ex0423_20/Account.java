package ex0423_20;

public class Account { //�ϳ��� ���� ������ ����ִ� Ŭ����
	private String ano; //���¹�ȣ > �ܺο��� ���� ����
	private String owner; //������
	private int balance;
	
	public Account(String ano, String owner, int balance) { //������, �ܺο��� ���� �޾Ƽ� �ʵ忡 ����
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
