import java.util.Scanner;
class Four_Lines
{ 
    public static void main(String args[])
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
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Elements at even index: ");
        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Odd Elements: ");
        for(int i=0; i<n; i++){
            if(arr[i]%2==1){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Reverse Order: ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("First Element "+arr[0]+" ");
        System.out.print("Last Element "+arr[arr.length-1]);
    }
}
