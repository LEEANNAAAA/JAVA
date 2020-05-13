import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
// 입력받은 하나의 문자가 알파벳 대문자이면 1을 아니면 0을 출력하는 프로그램을 작성하시오.		

		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0); // 문자하나 입력, (0)은 인덱스로 맨 첫번째 오는 문자

		if (ch >= 65 && ch <= 90) {	
			//  또는 (ch='A' && ch<='Z') 범위를 정확하게 정해주어야 한다. 
			//	if문에서 참이면 다음 else로 넘어가지 않는다.
			//  만약 ch>=65만 해버리고 'a'를 입력하면 이미 if문에서 만족하기 때문에 0이 출력되지 않는다.
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}

