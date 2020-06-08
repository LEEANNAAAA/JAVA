import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height;	
	}
	
	public Rectangle(int a, int b) {
		width = a;
		height = b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ʺ� �Է�: ");
		int a = sc.nextInt();
		System.out.print("���� �Է�: ");
		int b = sc.nextInt();
		Rectangle rect = new Rectangle(a,b);
		int area = rect.getArea();
		
		System.out.printf("�簢���� ������ %d",area);
	}
}
