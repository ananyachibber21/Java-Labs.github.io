 import java.util.Scanner;
import java.util.Arrays;

class FirstLast
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(arr));
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
