import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		int[] arr = {10,20,30,40,50};
		int[] brr = new int[10];
		
		System.arraycopy(arr, 0, brr, 3, arr.length); 
//		System.arraycopy(arr, 2, brr, 3, 3); //인덱스 갯수 맞춰주어야 함
//		배열, 이전 배열의 복사위치, 새 배열, 새로 붙여넣을 위치, 길이
	
		for (int i = 0; i < brr.length; i++) {
			System.out.printf("%4d",brr[i]);
		}
	}
}
