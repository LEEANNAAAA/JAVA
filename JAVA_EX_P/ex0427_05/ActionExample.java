package ex0427_05;


public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() { //action �������̼� �͸� ���� ��ü �����
			
			@Override // �������̽� �߻� �޼ҵ带 ������
			public void work() {
				System.out.println("���縦 �մϴ�.");
			}
		}; 
				
				
		action.work();
	}
}
