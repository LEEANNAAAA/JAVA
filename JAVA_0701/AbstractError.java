
public class AbstractError {

	public static void main(String[] args) {
//		Dobject obj = new Dobject(); //객체를 생성할 수 없음
		// 그러나 자식클래스를 이용하여 객체를 생성할 수 있음
		Dobject obj = new Line();
		obj.draw();

	}
}
