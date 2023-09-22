import java.util.Scanner;
import java.util.Arrays;
class Find_median
{
    public static double median(int arr[], int n){
        Arrays.sort(arr);
        if (n % 2 != 0)
            return (double)arr[n / 2];
 
        return (double)(arr[(n - 1) / 2] + arr[n / 2]) / 2.0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(median(arr, n));
    }
}
