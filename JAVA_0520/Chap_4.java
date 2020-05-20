import java.util.Scanner;

public class Chap_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int menu;
		do {
			System.out.println("1.파일열기");
			System.out.println("2.파일저장");
			System.out.print("메뉴 선택 >> ");
			menu = sc.nextInt();
			
		}while(menu <1||menu>2);
	}

}
