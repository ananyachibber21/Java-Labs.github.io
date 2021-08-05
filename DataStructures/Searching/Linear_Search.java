
import java.util.Scanner;
class Linear_Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(int i=0; i<10; i++){
            System.out.print("Enter: ");
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is given by: ");
        for(int i=0; i<10; i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n");
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        int flag = 0;

        for(int i=0; i<10; i++){
            if(arr[i]==num){
                flag = 1;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println(num + " is found at the index "+ flag);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
