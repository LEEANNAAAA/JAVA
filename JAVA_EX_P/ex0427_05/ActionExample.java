package ex0427_05;


public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() { //action 인터페이서 익명 구현 객체 만들기
			
			@Override // 인터페이스 추상 메소드를 재정의
			public void work() {
				System.out.println("복사를 합니다.");
			}
		}; 
				
				
		action.work();
	}
}
