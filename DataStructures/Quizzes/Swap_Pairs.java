import java.util.Scanner;
import java.util.Arrays;
class Swap_Pairs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int temp;
        System.out.println("Enter the size of the array: ");
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
        System.out.println();
        for(int i=0; i<n-1; i=i+2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        System.out.println(Arrays.toString(arr)+" ");
    }
}
