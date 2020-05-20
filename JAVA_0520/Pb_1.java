

public class Pb_1 {

	public static void main(String[] args) {
	
		  int i = 1;
		    do { //한번은 수행되는 부분

		        System.out.println(i);

		        i++;
		    }while(i < 0);

		    System.out.println("Do는 한번은 수행 합니다.");
		    



		    while(i < 0) {
		        System.out.println(i);
		    }

		    System.out.println("while문은 조건이 맞지 안으면 수행되지 않고 빠져나옵니다.");
	}
}
