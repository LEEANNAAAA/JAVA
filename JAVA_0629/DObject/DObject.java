package DObject;

public class DObject {
	public DObject next;	//next 필드 생성
	
	public DObject() {next = null;}
	
	public void draw() {
		System.out.println("DObject draw");
	}
}

class Line extends DObject{
	public void draw() {	//메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends DObject{
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends DObject{
	public void draw() {
		System.out.println("Circle");
	}
}
