import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		int evenArr=0, oddArr=0;
		System.out.print("Enter the length of array: ");
        int n = console.nextInt();
        int arr[]=  new int[n];
        
        for(int i=0;i<n;i++) {
        	System.out.println("Enter value: ");
        	arr[i]=console.nextInt();
        }
        
        System.out.println("The array is: ");
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        
        System.out.println("");
        for(int i=0;i<n;i++) {
        	if(arr[i]%2==0) {
        		System.out.println("The evenArray is: "+arr[i]+" ");
        		evenArr++;
        	}
        	else {
        		System.out.println("The oddArray is: "+arr[i]+" ");
        		oddArr++;
        	}
        }
        System.out.println("\nThe total even numbers are: "+evenArr);
        System.out.println("\nThe total odd numbers are: "+oddArr);
	}
}
