package may_0527;

public class Chap_10_1 {

	public static void main(String[] args) {
		// for �̿��ؼ� 100�� 0-9���� ��
		int[] a;
		a = new int[10];

		for (int i = 0; i < 100; i++) {
//			int n = (int)(Math.random()*10);
//			a[n]++;
			a[(int) (Math.random() * 10)]++;
		}
		int m = 0;

		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[m]) {
				m = i;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d:%4dȸ\n", i, a[i]);
		}
		System.out.printf("\n�ֺ�:%d, �ֹݰ��� �߻���:%d\n", m, a[m]);
	}
}
