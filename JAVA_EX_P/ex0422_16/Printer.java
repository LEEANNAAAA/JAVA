package ex0422_16;

public class Printer { //메소드 명은 동일한데 매개변수의 타입이 모두 다른 경우 > 오버로딩
	void println(int value) { 
		System.out.println(value);
	}
	
	void println(boolean value) { 
		System.out.println(value);
	}
	
	void println(double value) { 
		System.out.println(value);
	}
	
	void println(String value) { 
		System.out.println(value);
	}
}
