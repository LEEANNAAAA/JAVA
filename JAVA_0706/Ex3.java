
public class Ex3 {
	public static void main(String[] args) {
		String str = "Java�� �����ϴ� ��, Java�� ��վ��.^^";
		
//		System.out.println("���ڿ� ==>");
//		
//		System.out.println("���� ó�� ������ Java ��ġ");
//		System.out.println(str.indexOf("Java"));
//		System.out.println("�������� ������ Java ��ġ");
//		System.out.println(str.lastIndexOf("Java"));
		
		String str2 = str.replace("Java", "�ڹ�");
		String str3 = str.substring(0,4);
		String str4[] = str.split(",");
		
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
