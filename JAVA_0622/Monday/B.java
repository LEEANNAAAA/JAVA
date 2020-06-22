package Monday;

import june_0622.A;

public class B extends A{
	private int m;
	public void setM(int m) {
		this.m = m;
	}
	public int getM() {
		return m;
	}
	public String toString() {
		String s = getN() + " " + getM();
		return s;
	}
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		a.p = 5;
//		a.n = 5;	//n은 private멤버, 컴파일 오류 발생
		
		b.p = 5;
//		b.n = 5;
		b.setN(10);
		int i = b.getN();
		System.out.println(i);
		
		b.m = 20;
		b.setM(20);
		System.out.println(b.toString());
	}
}

