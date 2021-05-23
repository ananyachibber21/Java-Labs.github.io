import java.util.*;
public class IndexValue {

	public static void main(String[] args)
	{
		
		Scanner console = new Scanner(System.in);
		int arr[] = new int[10];
        int n= arr.length;
        int num;
        
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter value: ");
			arr[i]=console.nextInt();
		}
		
		System.out.print("The array is: ");
		for(int i=0;i<n;i++) 
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter a number to search index: ");
		num= console.nextInt();
		
		for(int i=0;i<n;i++) 
		{
			if(num==arr[i]) {
				System.out.println("The index is "+i);
			}
		}
	}
}
