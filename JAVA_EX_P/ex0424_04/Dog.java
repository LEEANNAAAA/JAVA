package ex0424_04;

public class Dog extends Animal{
	public Dog() {
		this.kind = "������";
	}
	
	@Override //�߻� �޼ҵ� ������
	public void sound() { 
		System.out.println("�۸�");
	}
	
}
