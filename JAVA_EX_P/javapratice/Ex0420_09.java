package javapratice;
import java.util.Scanner;

public class Ex0420_09 {

	public static void main(String[] args) {
		
		boolean run=true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) { 
			System.out.println("-------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) {
				System.out.print("학생수> "); // 입렵된 학생 수 출력
				studentNum = scanner.nextInt(); // 입력된 학생 수를 읽어서 
				scores = new int[studentNum]; //배열 길이로 입력된 학생 수 만큼 배열을 생성
				
			} else if(selectNo==2) {
				for(int i=0;i<scores.length;i++) {
					System.out.print("scores["+i+"]>"); //값을 입력할 수 있도록 ln x 
					scores[i] = scanner.nextInt();
				}
				
			} else if(selectNo ==3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				} // 2번 그대로 출력
				
			} else if(selectNo ==4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i])?scores[i]:max; // max와 배열의 항목 값을 비교, 배열의 항목 값이 더 크면 max에 배열의 항목 값을 넣어주고, 작으면 max유지. 
					sum += scores[i]; // 점수 계속 누적
				}
				
				avg = (double)sum/studentNum;
				System.out.println("최고 점수: "+ max);
				System.out.println("평균 점수: "+ avg);
				
			} else if(selectNo ==5) {
				run =false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}

}
