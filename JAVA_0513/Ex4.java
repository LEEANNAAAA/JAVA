import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		//세개의 정수 x,y,z를 입력받아 최대값 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력 >> ");
		int x = sc.nextInt();
		System.out.println("두번째 숫자 입력 >> ");
		int y = sc.nextInt();
		System.out.println("세번째 숫자 입력 >> ");
		int z = sc.nextInt();

		
		int max;
		
		max = (x>=y && x>=z) ? x : (y>=z? y : z);
		System.out.printf("최대값:%d\n",max);
		
		
		
//		int max;
//		int max2;
//		
//		max = x>y ? x : y;
//		max2 = max>z ? max : z;
//		System.out.printf("최대값:%d\n",max2);
		
		
	
		
	}
}
