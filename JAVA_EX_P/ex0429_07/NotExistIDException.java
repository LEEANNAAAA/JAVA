package ex0429_07;

public class NotExistIDException extends Exception{ //exception�� ��ӹ޴´�
	public NotExistIDException() {} //�⺻ ������
	public NotExistIDException(String message) {
		super(message); //message�� �θ��� ������ �Ű�������
	}

}
