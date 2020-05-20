public class Chap_8 {

	public static void main(String[] args) {

//		for (int j = 1; j <= 5; j++) { //행 제어
//			for (int i = 1; i <= 5; i++) { //열 제어
//				
//			}
//			System.out.println();
//		}
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
