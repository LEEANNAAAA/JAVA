package ex0429_06;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = {"10", "2a"}; //배열
		int value = 0; //로컬 변수 선언
		for(int i=0; i<=2; i++) { //0,1,2
			try {
				value = Integer.parseInt(strArray[i]);
				} catch(ArrayIndexOutOfBoundsException e) { //인덱스 범위를 초과하는 실행 예외
					System.out.println("인덱스를 초과했음");
				} catch(NumberFormatException e) { //문자를 숫자로 변환할 수 없는 실행 예외
					System.out.println("숫자로 변환할 수 없음");
				} finally {
					System.out.println(value);
				}
		}//finally 때문에 10이 3번 출력

}
}
