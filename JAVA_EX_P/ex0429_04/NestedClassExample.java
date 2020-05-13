package ex0429_04;

public class NestedClassExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		//멤버 클래스의 객체를 생성
		Car.Tire tire = myCar.new Tire(); //인스턴스 멤버 클래스
		Car.Engine engine = new Car.Engine(); //정적 멤버 클래스 > Car 객체 없이도 접근 가능

	}

}
