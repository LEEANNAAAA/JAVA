
public class Chap_2 {

	public static void main(String[] args) {
		//1~10까지의 합
		
		int i =1;
		int sum = 0;
		
		do {
			sum+=i;
			i++;
		} while(i<=10);

		System.out.println("전체합: "+ sum);
		
//		for(i=1;i<=10;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
	}

}
