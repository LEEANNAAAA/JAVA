
public class Circle {
	int radius;
	String name;
	
	public Circle() {	//원의 생성자 > 안써도 상관없음(컴파일러 과정 중 자동으로 삽입된다)
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle();	// Circle pizza = new Circle();	circle객체 생성
		pizza.radius = 10;
		pizza.name = "자바피자";
		double area = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "자바도넛";
		area = donut.getArea();
		System.out.println(donut.name+"의 면적은 "+area);
	}
}
