import java.util.Scanner;

public class Book3 {
	String title;
	String author;
	
	void show() {System.out.println(title+" "+author);}
	
	public Book3() {
		this("","");
//		System.out.println("생성자 호출됨");
	}
	
	public Book3(String title) {	//생성자
		this(title, "작자미상");
	}
	
	public Book3(String title, String author) {	//생성자
		this.title = title; 
		this.author = author;
	}
	
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		Book3[] b = new Book3[2];
		

		for (int i = 0; i < b.length; i++) {
			System.out.print("제목 입력: ");
			String title = sc.next();
			
			System.out.print("저자 입력: ");
			String name = sc.next();
			
			b[i] = new Book3(title, name);
		}
		
		for (int j = 0; j < b.length; j++) {
			b[j].show();
//			System.out.println(b[j].title + " "+b[j].author);
		}
	}
}
