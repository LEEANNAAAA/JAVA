package june_0629;

public class Shape {
	public void draw() {
		System.out.println("Shape");
	}
	
	public void test() {
		System.out.println("Test");
	}
}

class Line extends Shape {
//	public void draw() {
//		System.out.println("Line");
//	}
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rectangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

