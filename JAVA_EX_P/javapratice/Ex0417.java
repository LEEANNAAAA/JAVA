package javapratice;

public class Ex0417 {

	public static void main(String[] args) {
		int a = 200;
		int b = 017;
		double result = (double) a / b;
		
		
		System.out.println("1. " + a);
		System.out.println("2. " + b);
		System.out.println("3. " + result);
		
		
		if(b%2==0) {
			System.out.println("4. " + "Â¦¼ö");
		}
		else {
			System.out.println("4. " + "È¦¼ö");
		}
		
		
		
		for(int i=1;i<=a;i++) {
			System.out.println("5. "+ i);
		}
		
		
		int sum = 0;
		int i=1;
		while(i<=a) {
			sum+= i;
			i++;
		}

		System.out.println("6. " + sum);
	}

}
