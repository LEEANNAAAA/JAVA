
public class Goods {
	public String name;
	public int price;
	public int numberOfStock;
	public int sold;
	


	public Goods(String name2, int price2, int n, int sold2) {
		name = name2;
		price = price2;
		numberOfStock = n;
		sold = sold2;
	}
	

	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
	public int getSold() {
		return sold;
	}
	
	public Goods() {
	}
	
	public static void main(String[] args) {
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		System.out.println("��ǰ�̸� : "+ camera.name);
		System.out.println("��ǰ���� : "+ camera.price);
		System.out.println("������ : "+ camera.numberOfStock);
		System.out.println("�ȸ����� : "+ camera.sold);
	}
}
