import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int[] brr = new int[10];
		
//		brr = arr;
		
		for (int i = 0; i < arr.length; i++) {
			brr[i] = arr[i];
		}
		
		for (int i = 0; i < brr.length; i++) {
			System.out.printf("%5d",brr[i]);			
		}
	}
}
