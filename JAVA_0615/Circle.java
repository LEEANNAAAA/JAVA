
public class Circle {
	int radius;
	
	void set(int r) {radius = r;}
	
	double getArea() {return 3.14*radius*radius;}
	
	public Circle(int radius) {
		this.radius = radius;
//		radius = radius; > ����
	}
	
	public Circle() {
		
	}
	
	public static void main(String[] args) {
		
		Circle[] c = new Circle[5];		//�迭��ü ����
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i+1);
			System.out.println(c[i].getArea());
		}
		
//		Circle pizza = new Circle(10);
//		System.out.println(pizza.getArea());
//	
//		Circle donut = new Circle();
//		System.out.println(donut.getArea());
	
	}

}
