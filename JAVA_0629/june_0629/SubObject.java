package june_0629;

class SuperObject {
	protected String name;
	public void paint() {
	draw();
}
	public void draw() {
		System.out.println("나는 부모임");
		System.out.println(name+"??");
	}
}

public class SubObject extends SuperObject{
	protected String name;
	
	public void test() {	
		System.out.println("Test~");
	}
	
	public void draw() {
		System.out.println("나는 자식이다");
		name = "Sub";
		super.name = "Super"; 
		super.draw();
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		SuperObject b = new SubObject();
		System.out.println(b.name);	//필드는 무조건 부모
		System.out.println("-----------------");
		b.paint();	//자식을 재정의했기 때문에 자식 draw()로 감
		System.out.println("-----------------");
		b.draw();
		System.out.println("-----------------");
		System.out.println(b.name);	//필드는 무조건 부모
		
		System.out.println("-----------------");
		SuperObject a = new SuperObject();
		a.draw();
		
		System.out.println("-----------------");
		SubObject c = new SubObject();
		c.test();
		System.out.println("-----------------");
		
//		c.test();	//자식이 재정의한 메소드(or 필드)만 가능 > test는 안됨, 
		//자식이 스스로 추가한 것은 안됨
	}
}
