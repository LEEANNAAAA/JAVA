package ex0424_06;

public class Child extends Parent {
	private String name;

	public Child() {
		this("ȫ�浿"); //super �� this�� ���� ��� �Ұ�(�� �� ù�ٿ� �־�� �Ѵ�.)
		System.out.println("Child() call");
		
	}

		public Child(String name) {
			super();
			this.name = name;
			System.out.println("Child(String name) call " + this.name);
		}
}
