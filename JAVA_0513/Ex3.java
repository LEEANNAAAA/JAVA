import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x = 20;
		int y = 50;
		int max;
		
		//조건식 ? True_value : False_value;
		
		max = x>y ? x : y;
		System.out.printf("최댓값:%d\n", max);
	}

}
