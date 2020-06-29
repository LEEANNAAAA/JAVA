package DObject;

public class UsingOverride {
	public static void main(String[] args) {
		DObject start, last, obj;
		
		start = new Line();	//Line ��ü ����
		last = start;
		obj = new Rect();	//Rect ��ü ����
		last.next = obj;
		last = obj;
		obj = new Line();	//Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle();	//Circle ��ü ����
		last.next = obj;
		
		//��� ���� ���
		DObject p =start;
		
		while(p!=null) {
			p.draw();
			p = p.next;
		}
	}
}
