import java.util.Scanner;
class Occurence
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int search, count = 0;
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is given by: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.print("\n");
        System.out.println("Enter the number you want to search: ");
        search = sc.nextInt();
        for(int i=0; i<n; i++){
            if(arr[i] == search){
                count++;
            }
        }
        System.out.println(search + " occurs " + count + " times ");
    }
}
