package ex0429_05;

public class Anonymous {
	Vehicle field = new Vehicle() {

		@Override   //인터페이스 추상메소드 재정의
		public void run() {
			System.out.println("자전거가 달립니다."); //실행결과
			
		}
		
	};
			
			
	void method1() {
		Vehicle localVar = new Vehicle() {

			@Override
			public void run() {
				System.out.println("승용차가 달립니다.");
				
			}
			
		};
				
		localVar.run();
	}
	
	void method2(Vehicle v) {
		v.run();
	}
}
