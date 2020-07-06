import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		String str = "  한글  ABCD efgh  ";
		
//		System.out.println("원 문자열==>["+str+"]");
//		System.out.println("대문자로==>["+str.toUpperCase()+"]");
//		System.out.println("소문자로==>["+str.toLowerCase()+"]");
//		System.out.println("공백제거==>["+str.trim()+"]");
		
		String result = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				result += str.charAt(i);
			}
		}
		System.out.println("원 문자열 ==>["+str+"]");
		System.out.println("공백제거 ==>["+result+"]");
	}
}
