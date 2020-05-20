import java.lang.reflect.Array;
import java.util.Scanner;

public class Chap_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		char ans;

		while (true) {
			System.out.println("1.가위/바위/보");
			System.out.println("2.테트리스");
			System.out.println("\n게임선택>> ");
			n = sc.nextInt();
			
			if(n==1) {
				int cpu = (int) (Math.random() * 3) + 1;
				System.out.println("가위(1) 바위(2) 보(3)중 선택>> ");
				int num=sc.nextInt();
				System.out.println(cpu);

				if (num == 1) {
					System.out.print("\n가위 - ");
				} else if (num == 2) {
					System.out.print("\n바위 - ");
				} else if (num == 3) {
					System.out.print("\n보 - ");
				} else {
					System.out.println("\n오류");
				}

				if (cpu == 1) {
					System.out.println("가위\n");
				} else if (cpu == 2) {
					System.out.println("바위\n");
				} else {
					System.out.println("보\n");
				}

				String vic;

				switch (num) { // cpu가 들어가면 default부분 제대로 실행 x / num이 들어가야 모두 정상적으로 작동
				case 1:
					if (cpu == 2) {
						vic = "내가 승";
					} else if (cpu == 3) {
						vic = "컴퓨터 승";
					} else {
						vic = "무승부";
					}
					System.out.println("게임의 결과는 \"" + vic + "\"입니다.\n");
					break;
				case 2:
					if (cpu == 3) {
						vic = "내가 승";
					} else if (cpu == 1) {
						vic = "컴퓨터 승";
					} else {
						vic = "무승부";
					}
					System.out.println("게임의 결과는 \"" + vic + "\"입니다.\n");
					break;
				case 3:
					if (cpu == 1) {
						vic = "내가 승";
					} else if (cpu == 2) {
						vic = "컴퓨터 승";
					} else {
						vic = "무승부";
					}
					System.out.println("게임의 결과는 \"" + vic + "\"입니다.\n");
					break;
			}
				
			} else {
			System.out.println("\n게임을 계속하시겠습니까?(y/n)");
			sc.nextLine();
			ans = sc.nextLine().charAt(0);
			

			if (ans == 'n') {
				System.out.println("게임을 종료합니다.\n");
				break;
			}

		}

	}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int n;
//		char ans;
//
//		while (true) {
//			System.out.println("1.가위/바위/보");
//			System.out.println("2.테트리스");
//			System.out.println("\n게임선택>> ");
//			n = sc.nextInt();
//
//			if (n == 1) {
//
//				System.out.println("입력");
//				int me = sc.nextInt();
//				int cpu = (int) (Math.random() * 3) + 1;
//				System.out.println(cpu);
//
//				if (me == 1) {
//					System.out.println("\n가위 - ");
//				} else if (me == 2) {
//					System.out.println("\n바위 - ");
//				} else if (me == 3) {
//					System.out.print("\n보 - ");
//				} else {
//					System.out.println("\n오류");
//				}
//
//				if (cpu == 1) {
//					System.out.println("가위\n");
//				} else if (cpu == 2) {
//					System.out.println("바위\n");
//				} else {
//					System.out.println("보\n");
//				}
//
//				String vic = "";
//
//				if (me == 1) {
//					if (cpu == 1) {
//						vic = "무승부";
//					} else if (cpu == 2) {
//						vic = "컴퓨터 승";
//					} else {
//						vic = "내가 승";
//					}
//				} else if (me == 2) {
//					if (cpu == 2) {
//						vic = "무승부";
//					} else if (cpu == 3) {
//						vic = "컴퓨터 승";
//					} else {
//						vic = "내가 승";
//					}
//				}
//				if (me == 3) {
//					if (cpu == 3) {
//						vic = "무승부";
//					} else if (cpu == 1) {
//						vic = "컴퓨터 승";
//					} else {
//						vic = "내가 승";
//					}
//				}
//				System.out.println("게임의 결과는 \"" + vic + "\"입니다.\n");
//			} else {
//				System.out.println("\n게임을 계속하시겠습니까?(y/n)");
//				sc.nextLine();
//				ans=sc.nextLine().charAt(0);
//				
//				if(ans=='n') {
//					System.out.println("게임을 종료합니다.\n");
//					break;
//				} else if(ans=='y') {
//					System.out.println("계속합니다");
//				} else {
//					System.out.println("잘못입력");
//				}
//			}
//		}
}
}
