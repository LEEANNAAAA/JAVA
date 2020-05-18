import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("값을 입력하세요");
		int num = sc.nextInt();

		int sum = 0;
		int i = 1;
		
		while (i <= num) {
			sum += i; // sum = sum+i;
			i++;
		}

		System.out.println("1~" + (i - 1) + " 합 : " + sum);
		System.out.printf("전체합 : %d\n", sum);
		
		
//		while(true) {	 //논리값 true로 설정하게 되면 조건의 값이 항상 참이기에 무한루프 상태가 된다.
//			System.out.println("Hello~");
//		}
		
		
	}
}
