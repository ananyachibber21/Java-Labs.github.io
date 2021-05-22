class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;
 
        for (int i = 0; i < n-1; i++)
        {
            int min = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
  
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
  
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
    }

    void printMin(int arr[])
    {
        int n = arr.length;
        int min = arr[0];
        System.out.println("The min value is: "+ min);
    }

    void printMax(int arr[])
    {
        int n = arr.length;
        int max = arr[arr.length-1];
        System.out.println("The max value is: "+ max);
    }
}

class Max_Min{
    
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        ob.printMin(arr);
        ob.printMax(arr);
    }
}
