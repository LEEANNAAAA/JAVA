import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		
		int sum = 0;
		
		for(int n: arr) {	//정수형 변수 n한테 준다(알아서 순서대로), for루프는 일반적으로 배열에서 자주 사용
			sum+=n;
		}
		System.out.printf("전체합:%d\n",sum);
	}
}
