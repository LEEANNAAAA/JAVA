package june_0629;

class CPoint {
	int x;
	int y;
	String color;

	public CPoint(int x, int y) {
		this.x = x;
		this.y = y;
		color = "";
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")");
	}
	
	public String show1() {
		System.out.println("(" + x + "," + y + "," + color + ")");
		return color;
	}
}

class CColorPoint extends CPoint {

	public CColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
}

public class Mission {
	public static void main(String[] args) {
		CPoint a, b;

		a = new CPoint(2, 3);
		b = new CColorPoint(3, 4, "red");
		a.show();
		b.show();

	}
}
