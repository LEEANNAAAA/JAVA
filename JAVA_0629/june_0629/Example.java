package june_0629;


	public class Example {

		void A (){System.out.println("void A()");} // > void�� ���ϰ�

		void A (int arg1){System.out.println("void A (int arg1)");}

		void A (String arg1){System.out.println("void A (String arg1)");}

		//int A (){System.out.println("void A()");} > int�� ���ϰ�

		public static void main(String[] args) {

			Example od = new Example();

		od.A();

		od.A(1);

		od.A("coding everybody");

		}

		}

