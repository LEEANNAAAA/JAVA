package june_0629;

class SuperObject {
	protected String name;
	public void paint() {
	draw();
}
	public void draw() {
		System.out.println("���� �θ���");
		System.out.println(name+"??");
	}
}

public class SubObject extends SuperObject{
	protected String name;
	
	public void test() {	
		System.out.println("Test~");
	}
	
	public void draw() {
		System.out.println("���� �ڽ��̴�");
		name = "Sub";
		super.name = "Super"; 
		super.draw();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		SuperObject b = new SubObject();
		System.out.println(b.name);	//�ʵ�� ������ �θ�
		System.out.println("-----------------");
		b.paint();	//�ڽ��� �������߱� ������ �ڽ� draw()�� ��
		System.out.println("-----------------");
		b.draw();
		System.out.println("-----------------");
		System.out.println(b.name);	//�ʵ�� ������ �θ�
		
		System.out.println("-----------------");
		SuperObject a = new SuperObject();
		a.draw();
		
		System.out.println("-----------------");
		SubObject c = new SubObject();
		c.test();
		System.out.println("-----------------");
		
//		c.test();	//�ڽ��� �������� �޼ҵ�(or �ʵ�)�� ���� > test�� �ȵ�, 
		//�ڽ��� ������ �߰��� ���� �ȵ�
	}
}
