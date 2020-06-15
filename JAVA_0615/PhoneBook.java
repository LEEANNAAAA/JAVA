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

      System.out.print("인원수 >> ");
      int num = sc.nextInt();
      Phone[] p = new Phone[num];

      for (int i = 0; i < p.length; i++) {
         System.out.print("이름과 전화번호(이름과 전화번호는 빈칸없이 입력)>>");
         String name = sc.next();
         String tel = sc.next();

         p[i] = new Phone(name, tel);
      }
      System.out.println("저장되었습니다.");

      for (int i = 0; i < p.length; i++) {
      System.out.println(p[i].name+" "+p[i].tel);
   }
      
      
      boolean run= true;
      
      while (run) {

         System.out.print("검색할 이름>>");
         String name = sc.next();
         int cnt=0;
         
         if(name.equals("그만")) {
            break;
         }
         
         for (int j = 0; j < p.length; j++) {

            
            if (name.equals(p[j].name)) {
               System.out.println(p[j].name + "의 전화번호는 " + p[j].tel + " 입니다.");
               break;}
               else {
                 cnt+=1;
               }
            } 
         if(cnt==num)
         System.out.println(name+"은(는) 없습니다.");
         }
         
         System.out.println();
         
      }

   }
}