import java.util.Scanner;

class Insert_Element
{
    public static void main(String args[]){
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
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element you want to insert:");
        int element=sc.nextInt();
        System.out.println("Enter the index no of array where you want to insert:");
        int index= sc.nextInt();
        for (int i=n-1; i>=index;i--)
        {
          arr[i]=arr[i-1];           
        }
        arr[index]=element;
        System.out.print("After inserting:");
        for(int i = 0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
