import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ����");
		int a = sc.nextInt();
		System.out.println("�ι�° ����");
		int b = sc.nextInt();
		System.out.println("����° ����");
		int c = sc.nextInt();

//		if (a >= b && a >= c) {
//			System.out.println("�ִ밪: "+a);
//		} else if (b >= c) {
//			System.out.println("�ִ밪: "+b);
//		} else {
//			System.out.println("�ִ밪: "+c);
//		}
		
		if(a>b) {
			if(a>c) {
				System.out.println("�ִ밪: "+a);
			} else {
				System.out.println("�ִ밪: "+c);
			}
				
		} else {
			 if(b>c) {
				 System.out.println("�ִ밪: "+b);
			 } else {
				 System.out.println("�ִ밪: "+c);
			 }
		
	}
}
}