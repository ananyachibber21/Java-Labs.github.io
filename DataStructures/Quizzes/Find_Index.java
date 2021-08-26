import java.util.Scanner;

class Find_Index{
    public static void main(String[] args){
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
        System.out.print("Elements the element to find index: ");
        int search = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i]==search){
                System.out.print(i);
            }
        }
    }
}
