package ex0424_05;


	public class Child extends Parent {
		private int studentNo;
		
		//자식 클래스 생성자
		public Child(String name, int studentNo) {
			super(name); // 부모 클래스 호출이 명시적으로 없고 매개변수가 존재하므로 super(매개값); 으로 표기해야 한다.
			this.studentNo = studentNo;
		}
	}
