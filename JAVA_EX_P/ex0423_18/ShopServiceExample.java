package ex0423_18;


		public class ShopServiceExample {

			public static void main(String[] args) {
				ShopService obj1 = ShopService.getInstance(); //private이므로 new.ShopService로 x
				ShopService obj2 = ShopService.getInstance();
				
				if(obj1 == obj2) { 
					System.out.println("같은 ShopService 객체 입니다.");
				} else {
					System.out.println("다른 ShopService 객체 입니다.");
				}

			}

		


	}
