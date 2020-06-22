package Temp;

public class B extends A{
	void set() {
		i=1;
		pro=2;
//		pri=3;
		setPri(3);
		pub=4;
	}
	public static void main(String[] args) {
		B b = new B();
		b.set();

		
		System.out.println("i의 값: "+b.i);
		System.out.println("pro의 값: "+b.pro);
		System.out.println("Pri의 값: "+b.getPri());
		System.out.println("pub의 값: "+b.pub);
		
	}
}
