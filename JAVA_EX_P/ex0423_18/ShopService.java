package ex0423_18;

public class ShopService {
	private static ShopService singleton = new ShopService(); 
	// 자기 자신의 타입을 가지면서 필드(singleton)선언, 자기 자신의 객체 생성
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		return singleton;
	}
}
