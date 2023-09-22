import java.util.Scanner;
import java.util.Arrays;
class Size_Five
{ 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0, sum1 = 0;
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
        System.out.println("Sum of all the elements: ");
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        System.out.print(sum);
        System.out.println();
        System.out.println("Sum of all the alternate elements: ");
        for(int i=0; i<n; i++){
            if(i%2==0){
                sum1 = sum1 + arr[i];
            }            
        }
        System.out.print(sum1);
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Second highest Number: ");
        System.out.print(arr[n-2]);
    }
}
