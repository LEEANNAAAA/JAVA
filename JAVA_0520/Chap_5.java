import java.util.Scanner;

public class Chap_5 {

	public static void main(String[] args) {
		//달을 입력하면 며칠까지 있는지 출력
		//제대로 입력하지 않으면 다시입력하세요 라고 다시 출력
		Scanner sc = new Scanner(System.in);
		
		int mon;
		int days;
		
		do {
			System.out.println("달을 입력해주세요");
			mon = sc.nextInt();
			
//			if(!(mon>=1&&mon>=12))
//			System.out.println("잘못입력");
//			else break;
//			}while(true);
			
//			switch~~
			
		switch(mon) {
			case 1: case 3: case 5: case 7: case 10: case 12:
				days = 31;
				System.out.printf("%d달은 %d일까지 있습니다\n",mon, days);
				break;
			case 2:
				days = 28;
				System.out.printf("%d달은 %d일까지 있습니다\n",mon, days);
				break;
			case 4: case 6: case 8: case 9: case 11:
				days = 30;
				System.out.printf("%d달은 %d일까지 있습니다\n",mon, days);
				break;
			default:
				System.out.println("잘못입력하셨습니다");
				break;
				
			}
		
		}while(!(mon>=1&&mon>=12));
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//
//		int mon;
//		int days = 0;
//
//			while(true) {
//			System.out.println("입력");
//			mon = sc.nextInt();
//			
//			if(mon%2==0 && mon!=2 && mon<=12) {
//				days=30;			
//				System.out.printf("%d달은 %d일 입니다.\n", mon, days);
//			} else if(mon%2==1 && mon<=12) {
//				days=31;
//				System.out.printf("%d달은 %d일 입니다.\n", mon, days);
//			} else if(mon==2) {
//				days=28;
//				System.out.printf("%d달은 %d일 입니다.\n", mon, days);
//			} else {
//				System.out.println("잘못 입력!!");
//			}
//
//			
//		
//			}
		
	}

}
