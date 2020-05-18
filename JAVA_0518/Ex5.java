import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("연도를 입력해주세요>> ");
		int year = sc.nextInt();
		System.out.print("월을 입력해주세요>> ");
		int month = sc.nextInt();
		int days;
		
		switch(month) {
		case 2: 
			if((year%4==0 && year%100!=0)||year%400==0) {
				days = 29;
			} else {
				days = 28;
			}
			break;
		case 4: case 6: case 9: case 11: days = 30;
			break;
		default: days = 31;
			break;
		}
		System.out.printf("%d년 %d달은 %d일까지 있습니다.", year, month, days);
}
	
}