import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		int i =1;

		while(true) {
			if(i>5)
				break;	//원래는 반복문에서만 break사용한다. 예외로 switch에서도 사용 가능
			System.out.println("Hello");
			
//			if(i>=5)
//				break;	//두가지 가능
			
			i++;
		}
		
	}
}
