
public class Test1 {
	
	public static int add(int x, int y) {
		return x+y;
	}
	
	public static int comSum(int[] a) {
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		return sum;
	}
	
	public static int comSum1(int ...a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int result = add(10,20);
		System.out.printf("Result:%d\n",result);

		int[] arr = new int[5];
		int result1 = comSum(arr);
		System.out.printf("Result1:%d\n",result1);
		
		int result2 = comSum1(10,20,30,40,50);
		System.out.printf("Result2:%d",result2);
	}
}
