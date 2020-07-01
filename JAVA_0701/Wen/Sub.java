package Wen;

public class Sub extends Calc{

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return a-b;
	}
	

}
