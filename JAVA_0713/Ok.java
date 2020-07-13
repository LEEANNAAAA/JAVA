package july_0713;

import java.util.Arrays;

public class Ok {
	
		   public static void main(String[] args) {
		      int[] arr = new  int[]{30,20,10,90,100,0,40,50};
		      int temp;
		      int x = 0;
		      
		      for (int i = 0; i < arr.length; i++) {
		         if(arr[i]==0) {
		               x=i-1;
		            }
		         }
		      
		         
		      for (int i = 0; i < x; i++) {
		         
		         temp=arr[i];
		         arr[i]=arr[x];
		         arr[x]=temp;
		         x--;
		   

		      }
		      for (int i = 0; i < arr.length; i++) {
		         System.out.println(arr[i]);
		      }
		      
}
}