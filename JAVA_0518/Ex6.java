import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		// 가위 -1 , 바위 - 2 , 보 - 3
		// 컴퓨터 승, 내가 승, 무승부

		Scanner sc = new Scanner(System.in);
		System.out.println("가위(1) 바위(2) 보(3)중 선택>> ");
		int num = sc.nextInt();
		int cpu = (int) (Math.random() * 3) + 1;
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

		String vic; // String = "";(아무값도 없다)로 써줘도 가능(만약 ""도 없고 default값도 없으면 sout에서 vic오류남 > 1-3외의
					// 값이 나올 경우에 대한 결과가 없으므로

		switch (num) { // cpu가 들어가면 default부분 제대로 실행 x / num이 들어가야 모두 정상적으로 작동
		case 1:
			if (cpu == 2) {
				vic = "내가 승";
			} else if (cpu == 3) {
				vic = "컴퓨터 승";
			} else {
				vic = "무승부";
			}
			break;
		case 2:
			if (cpu == 3) {
				vic = "내가 승";
			} else if (cpu == 1) {
				vic = "컴퓨터 승";
			} else {
				vic = "무승부";
			}
			break;
		case 3:
			if (cpu == 1) {
				vic = "내가 승";
			} else if (cpu == 2) {
				vic = "컴퓨터 승";
			} else {
				vic = "무승부";
			}
			break;
		default:
			vic = "오류";
		}

		System.out.println("게임의 결과는 \"" + vic + "\"입니다.\n");
		System.out.printf("컴퓨터는 %s를 냈습니다.\n\n", cpu == 1 ? "가위" : cpu == 2 ? "바위" : "보");
		System.out.println("좋은 승부였다!");

	}
}