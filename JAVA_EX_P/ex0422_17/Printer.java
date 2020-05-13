package ex0422_17;

public class Printer { //메소드 명은 동일한데 매개변수의 타입이 모두 다른 경우 > 오버로딩
	static void println(int value) {  //static 을 붙여준다. 
		System.out.println(value);
	}
	
	static void println(boolean value) { 
		System.out.println(value);
	}

	static void println(double value) { 
		System.out.println(value);
	}
	
	static void println(String value) { 
		System.out.println(value);
	}
}
