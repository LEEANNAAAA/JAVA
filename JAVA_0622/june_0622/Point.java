package june_0622;

public class Point {
	int x,y;
	protected void set(int x, int y) {
		this.x=x;
		this.y=y;
	}
	protected void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
