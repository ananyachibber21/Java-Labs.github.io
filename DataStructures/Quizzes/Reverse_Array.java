import java.util.ArrayList;

class Reverse_Array
{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = {1,2,3,4,5};
        for(int i=arr.length-1; i>=0; i--){
            list.add(arr[i]);
        }
        System.out.println(list);
    }
}
