import java.util.Scanner;

class Linear_Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int i;
        for(i=0;i<size;i++){
            System.out.println("Enter a number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The created array is: ");
        for(i=0;i<size;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.print("\n");
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        int flag = 0;
        for(i=0;i<size;i++){
            if(arr[i]==num){
                System.out.println(num + " is found at the position " + (i+1));
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Number not found");
        }
    }
}
