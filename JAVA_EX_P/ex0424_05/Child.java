package ex0424_05;


	public class Child extends Parent {
		private int studentNo;
		
		//�ڽ� Ŭ���� ������
		public Child(String name, int studentNo) {
			super(name); // �θ� Ŭ���� ȣ���� ��������� ���� �Ű������� �����ϹǷ� super(�Ű���); ���� ǥ���ؾ� �Ѵ�.
			this.studentNo = studentNo;
		}
	}
