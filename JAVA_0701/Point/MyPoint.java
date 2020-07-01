package Point;

public abstract class MyPoint {
	
	int x;
	int y;
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;		
	}
	
	protected abstract void move(int x, int y); // x,y��ŭ ��ġ�� �̵�(+)
	protected abstract void reverse();	//(x,y)���� (y,x)�� ��ġ ����
	protected void show() {
		System.out.println(x+","+y);
	}
	
}
