import java.util.*;

class Sumofarray{

    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        int arr[]= new int[5];
        int n,ch,sum=0;
        System.out.println("Enter the size of array: ");
        n=console.nextInt();
        int[] input = new int[n];
       
        for(int i=1;i<n;i++){
            System.out.println("Enter the value: ");
            arr[i]= console.nextInt();
        }

        System.out.println("The element of an array is ");
        for(int i=1;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        System.out.println("1- Press 1 to find the sum of all the elements in an array");
        System.out.println("2- Press 2 to find the sum of alternative elements");
        System.out.println("Enter your choice: ");
        ch=console.nextInt();
        switch(ch){
            case 1: 
                for(int i=0;i<n;i++){
                    sum=sum+arr[i];
                }
                System.out.println("The sum of all the elements: "+sum);
                break;

            case 2: 
                for(int i=0;i<n;i++){
                    if(i%2==0){
                        sum=sum+arr[i];
                    }
                }
                System.out.println("The sum of all the elements: "+sum);
                break;

            default:
                System.out.println("Enter correct choice!");
        }
    }
}
