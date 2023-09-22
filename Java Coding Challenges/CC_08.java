import java.util.*;

public class CC_08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {3,6,4,0,1,5,6};
		System.out.print("Original Array: ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(); 
		int temp;
        for(int i=0; i<arr.length; i++) {
        	for(int j=i+1; j<arr.length; j++) {
        		if(arr[i]>arr[j]) {
        			temp = arr[i];
        			arr[i] = arr[j];
        			arr[j] = temp;
        		}
        	}
        }
        System.out.println(); 
        System.out.print("Sorted Array: ");
        for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
