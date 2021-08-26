import java.util.Scanner;

class Remove_Element
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
        System.out.println("Enter the element what you want delete :");
        int element = sc.nextInt(),flag=0,k=0;

        for (int i=0;i<n-1;i++)
        {
            if(arr[i]==element){
            flag=1;
                k=i; 
            }
        }
        if(flag==1){
            for(int i=k;i<n-1;i++){
                arr[i]=arr[i+1];
            }
        }
        else{
            System.out.println("element is not found in the array");
        }
        System.out.println("After deletion ");
        for (int i=0;i<n-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
