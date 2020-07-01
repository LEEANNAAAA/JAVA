package Point;

public class MyColorPoint extends MyPoint{

	public MyColorPoint(int x, int y, String Color) {
		super(x, y);
		System.out.println(x+","+y+","+Color);
	}	//생성자는 클래스의 필드를 초기화하는 역할, 생성자는 메소드의 일종, 리턴타입 없음

	@Override
	protected void move(int x, int y) {
		this.x += x;
		this.y += y;
		System.out.println(this.x+","+this.y);
	}
	
	@Override
	protected void reverse() {
		int temp = x;
		x = y;
		y = temp;
		show();
//		System.out.println(x+","+y);
	}
	
//	@Override
//	protected void show() {
//		super.show();
//	}
	
	public static void main(String[] args) {
		MyPoint p = new MyColorPoint(2,3,"blue");
		p.move(3, 4);
		p.reverse();
		p.show();
	}




}
