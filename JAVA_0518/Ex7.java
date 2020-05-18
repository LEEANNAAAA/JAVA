import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		int cnt=1;
		
		while(cnt<=5) {
		System.out.println("Hello");
		cnt++;	//증가하는 식을 써주지 않으면 무한 반복한다.
	}
		
//		while(mul<=9) {
//			System.out.println("7 x "+mul+" = "+(7*mul));
//			mul++;
//		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int input = sc.nextInt();
		
		int mul=1;
		while(mul<=9) {
			System.out.printf(" %d x %d = %d\n", input, mul, input*mul);
			mul++;
		}
		
		
}
}
