package Example;

public class Chap_07 {

	public static void main(String[] args) {
		double var1 = 3.14;
		//float var2 = 3.14;
		float var3 = 3.14F;
		
		double var4 = 1.0234566890123456689;
		float var5 = 1.0234566890123456689f;
		
		System.out.println(var1);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
		
		System.out.println("-------------------------------------");
		//e사용하기
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 = 2e-3;	//(2*(10의 -3승))

		System.out.println(var6);
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
	}

}
