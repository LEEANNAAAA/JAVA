package DObject;

public class MethodOverridingEx {
	public static void main(String[] args) {
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = line;
		
		obj.draw();		//DObject.draw() �޼ҵ� ����
		line.draw();	//Line.draw()�޼ҵ� ����
		p.draw();	//�������̵��� �޼ҵ� Line.draw()����, "Line"���
		r.draw();	//�������̵��� �޼ҵ� Line.draw()����, "Line"���
		
		DObject rect = new Rect();
		DObject circle = new Circle();
		rect.draw();
		circle.draw();
	}
}
