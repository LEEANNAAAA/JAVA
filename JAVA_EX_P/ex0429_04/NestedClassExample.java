package ex0429_04;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//��� Ŭ������ ��ü�� ����
		Car.Tire tire = myCar.new Tire(); //�ν��Ͻ� ��� Ŭ����
		Car.Engine engine = new Car.Engine(); //���� ��� Ŭ���� > Car ��ü ���̵� ���� ����

	}

}
