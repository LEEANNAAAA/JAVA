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

		
		System.out.println("i�� ��: "+b.i);
		System.out.println("pro�� ��: "+b.pro);
		System.out.println("Pri�� ��: "+b.getPri());
		System.out.println("pub�� ��: "+b.pub);
		
	}
}
