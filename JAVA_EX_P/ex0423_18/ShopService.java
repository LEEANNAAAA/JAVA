package ex0423_18;

public class ShopService {
	private static ShopService singleton = new ShopService(); 
	// �ڱ� �ڽ��� Ÿ���� �����鼭 �ʵ�(singleton)����, �ڱ� �ڽ��� ��ü ����
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return singleton;
	}
}
