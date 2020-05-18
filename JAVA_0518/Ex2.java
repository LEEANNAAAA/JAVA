import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("과세 표준 : ");
		int sta = sc.nextInt();
		double tax;
		
//		if(sta>8000) {
//			System.out.println("소득세는 "+ (sta*0.35)+"만원입니다.");
//		} else if(sta>4000) {
//			System.out.println("소득세는 "+ (sta*0.26)+"만원입니다.");
//		} else if(sta>1000) {
//			System.out.println("소득세는 "+ (sta*0.17)+"만원입니다.");
//		} else if(sta<=1000) {
//			System.out.println("소득세는 "+ (sta*0.08)+"만원입니다.");
//		}
		
		if(sta<=1000) {
			tax = sta *0.08;
		} else if(sta<=4000) {
			tax = sta *0.17;
		} else if(sta<=8000) {
			tax = sta *0.26;
		} else {
			tax = sta *0.35;
		}

		System.out.printf("소득세: %.0f\n", tax);
	}

}
