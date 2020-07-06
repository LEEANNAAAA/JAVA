import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		
		System.out.println("문자열 입력 ==>");
		str = sc.nextLine();
		
		System.out.println("출력 문자열 ==>");
		
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i)=='o') {
//				System.out.printf("%c",'$');
//			} else {
//				System.out.printf("%c",str.charAt(i));
//			}
//		}
		
		
		if(!str.startsWith("(")){
			System.out.print("(");
		} 
		
		for (int i = 0; i < str.length(); i++) {	//배열이 아니라 메소드를 가져오는 것 그래서 ()필요
			System.out.printf("%c", str.charAt(i));
		}
		
		if(!str.endsWith(")")){
			System.out.print(")");
		} 
		
	}
}
