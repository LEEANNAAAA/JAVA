package ex0424_04;

public class Cat extends Animal{
	public Cat() {
		this.kind = "������";
	}
	
	@Override //�߻� �޼ҵ� ������
	public void sound() { 
		System.out.println("�߿�");
	}
	
}
