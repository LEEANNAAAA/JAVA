package Wen;

public class Mul extends Calc{

	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	@Override
	public int calculate() {
		return a*b;
	}
	
}
