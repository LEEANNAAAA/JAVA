import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		System.out.println("�⸻ ��� ���� : ");
		int fin = sc.nextInt();
		
		double avg = (mid+fin)/2;
		char grd;
		
		if(avg>=90) {
			grd = 'A';
		} else if(avg>=80) {
			grd = 'B';
		} else if(avg>=70) {
			grd = 'C';
		} else {
			grd = 'D';
		}
		
		System.out.printf("����� ������ %c�����Դϴ�.", grd);
		

}
	
}