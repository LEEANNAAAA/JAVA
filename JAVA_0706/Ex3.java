
public class Ex3 {
	public static void main(String[] args) {
		String str = "Java를 공부하는 중, Java는 재밌어요.^^";
		
//		System.out.println("문자열 ==>");
//		
//		System.out.println("제일 처음 나오는 Java 위치");
//		System.out.println(str.indexOf("Java"));
//		System.out.println("마지막에 나오는 Java 위치");
//		System.out.println(str.lastIndexOf("Java"));
		
		String str2 = str.replace("Java", "자바");
		String str3 = str.substring(0,4);
		String str4[] = str.split(",");
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
