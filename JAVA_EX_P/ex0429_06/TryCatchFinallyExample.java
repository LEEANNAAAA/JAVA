package ex0429_06;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		String[] strArray = {"10", "2a"}; //�迭
		int value = 0; //���� ���� ����
		for(int i=0; i<=2; i++) { //0,1,2
			try {
				value = Integer.parseInt(strArray[i]);
				} catch(ArrayIndexOutOfBoundsException e) { //�ε��� ������ �ʰ��ϴ� ���� ����
					System.out.println("�ε����� �ʰ�����");
				} catch(NumberFormatException e) { //���ڸ� ���ڷ� ��ȯ�� �� ���� ���� ����
					System.out.println("���ڷ� ��ȯ�� �� ����");
				} finally {
					System.out.println(value);
				}
		}//finally ������ 10�� 3�� ���

}
}
