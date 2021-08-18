import java.util.Scanner;

class BubbleSort
{
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class SortBubble
 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        BubbleSort ob = new BubbleSort();
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The array: ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n");
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

        int second = arr[n-2];
        System.out.println("The second highest number in the array: "+ second);
    }
}
