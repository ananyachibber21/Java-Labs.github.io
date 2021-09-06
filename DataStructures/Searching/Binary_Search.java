import java.util.Scanner;

class BinarySearch
{
    int binary(int arr[], int start, int end, int num)
    {
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==num){
                return mid;
            }
            else if(arr[mid]>num){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }        
        }  
        return -1;  
    }
}

class Binary_Search
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        BinarySearch obj = new BinarySearch();
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter: ");
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        System.out.println("Enter the number you want to search: ");
        int num = sc.nextInt();
        int l = arr.length;
        int result = obj.binary(arr, 0, l-1, num);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found: "+ result);
        }        
    }
}



