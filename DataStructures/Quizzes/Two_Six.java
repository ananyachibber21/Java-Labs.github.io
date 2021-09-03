import java.util.*; 
public class Two_Six
{  
   public static void main(String args[])   
   {  
       Scanner sc=new Scanner(System.in);
       int n,occ=0,count=0,i;    
       System.out.println("Enter the total number of elements ");
       n=sc.nextInt();   
       int arr[]=new int[n];  
       System.out.println("Enter the elements of the array ");
       for( i=0; i<n ;i++)    
      {
          arr[i]=sc.nextInt();
      }
       for ( i=0; i < (arr.length-1); i++) {
       if (arr[i] == 6) 
       {
       if (arr[i+1] == 6 || arr[i+1] == 7) 
       {
      count++;
      }
    }
  }
  System.out.println("Enter the elements of the array "+count);
}
}
