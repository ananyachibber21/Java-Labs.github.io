import java.util.*;
public class CC_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		int n = sc.nextInt();
		int[] arr =new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.print("Output: "+ sum);

	}

}
