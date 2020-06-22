package Monday;

public class Goods {
	public String name;
	int price;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public Goods() {
		System.out.println("Goods~~");
	}
	
	
	public String toString() {
		return "Α¦Η°Έν: " + getName();
	}
}
