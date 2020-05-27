package may_0527;

public class Chap_10 {

	public static void main(String[] args) {
		// for 이용해서 100번 0-9사이 값
		int[] a;
		a = new int[10];
		int i, j;

		for (i = 0; i < 100; i++) {
			a[(int) (Math.random() * 10)]++;
		}

		for (int k = 0; k < a.length; k++) {
			System.out.println("a[" + k + "]" + ":" + a[k] + "번");
		}
	}
}