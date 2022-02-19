import java.util.*;
public class First {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		      int array[] =new int[n] ;
		     for(int i=0;i<n;i++) {
		    	 array[i]=sc.nextInt();
		     }
		      int countArray[] = new int[array.length];
		      for(int i=0; i<array.length; i++) {
		         countArray[i] = 0;
		      }
		      for(int i=0; i<array.length; i++) {
		         for(int j=0; j<array.length;j++) {
		            if(i!=j && array[i]==array[j]) {
		               countArray[i]++;
		            }
		         }
		      }
		      System.out.println(Arrays.toString(countArray));
		      for(int i=0; i<array.length; i++) {
		         if(countArray[i]==0) {
		            System.out.println(array[i]);
		            break;
		         }
		      }
		   }
		
     }



