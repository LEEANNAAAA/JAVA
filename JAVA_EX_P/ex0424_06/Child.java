package ex0424_06;

public class Child extends Parent {
	private String name;

	public Child() {
		this("홍길동"); //super 와 this는 같이 사용 불가(둘 다 첫줄에 있어야 한다.)
		System.out.println("Child() call");
		
	}

		public Child(String name) {
			super();
			this.name = name;
			System.out.println("Child(String name) call " + this.name);
		}
}
