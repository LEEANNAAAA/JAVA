package ex0424_04;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); // �ڵ� Ÿ�� ��ȯ
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*
		 * parent.field2 = "data2"
		 * parent.method3(); > �Ұ���, �ڽ� Ŭ������ �����Ƿ�
		 */
		
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3(); // ���� Ÿ�� ��ȯ

	}

}
