package DObject;

public class MethodOverridingEx {
	public static void main(String[] args) {
		DObject obj = new DObject();
		Line line = new Line();
		DObject p = new Line();
		DObject r = line;
		
		obj.draw();		//DObject.draw() 메소드 실행
		line.draw();	//Line.draw()메소드 실행
		p.draw();	//오버라이딩된 메소드 Line.draw()실행, "Line"출력
		r.draw();	//오버라이딩된 메소드 Line.draw()실행, "Line"출력
		
		DObject rect = new Rect();
		DObject circle = new Circle();
		rect.draw();
		circle.draw();
	}
}
