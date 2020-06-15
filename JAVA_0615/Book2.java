
public class Book2 {
	String title;
	String author;
	
	void show() {System.out.println(title+" "+author);}
	
	public Book2() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public Book2(String title) {	//생성자
		this(title, "작자미상");
	}
	
	public Book2(String title, String author) {	//생성자
		this.title = title; 
		this.author = author;
	}
	
	public static void main(String [] args) {
		Book2 littlePrince = new Book2("어린왕자","생텍쥐페리");
		Book2 loveStory = new Book2("춘향전");
		Book2 emptyBook = new Book2();
		loveStory.show();
		littlePrince.show();
		emptyBook.show(); 	//빈 문자열
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		
	}
}
