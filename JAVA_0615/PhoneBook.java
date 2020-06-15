import java.util.Scanner;

class Phone{
   public String name;
   public String tel;

   public Phone(String name, String tel) {
      this.name = name;
      this.tel = tel;
   }

public class PhoneBook{
   public void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);

      System.out.print("�ο��� >> ");
      int num = sc.nextInt();
      Phone[] p = new Phone[num];

      for (int i = 0; i < p.length; i++) {
         System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȭ��ȣ�� ��ĭ���� �Է�)>>");
         String name = sc.next();
         String tel = sc.next();

         p[i] = new Phone(name, tel);
      }
      System.out.println("����Ǿ����ϴ�.");

      for (int i = 0; i < p.length; i++) {
      System.out.println(p[i].name+" "+p[i].tel);
   }
      
      
      boolean run= true;
      
      while (run) {

         System.out.print("�˻��� �̸�>>");
         String name = sc.next();
         int cnt=0;
         
         if(name.equals("�׸�")) {
            break;
         }
         
         for (int j = 0; j < p.length; j++) {

            
            if (name.equals(p[j].name)) {
               System.out.println(p[j].name + "�� ��ȭ��ȣ�� " + p[j].tel + " �Դϴ�.");
               break;}
               else {
                 cnt+=1;
               }
            } 
         if(cnt==num)
         System.out.println(name+"��(��) �����ϴ�.");
         }
         
         System.out.println();
         
      }

   }
}