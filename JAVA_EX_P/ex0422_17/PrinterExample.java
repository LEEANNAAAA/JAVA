package ex0422_17;

public class PrinterExample {

	public static void main(String[] args) {
		//Printer printer = new Printer(); 정적은 객체를 따로 만들지 않고
		Printer.println(10); //printer x, Printer!! 클래스 이름으로 접근
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("홍길동");


	}

}
