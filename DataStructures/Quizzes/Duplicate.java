import java.util.Arrays; 
import java.util.ArrayList; 
public class Duplicate {
  public static void main(String[] args) 
    {   
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] arr = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if ((arr[i] == arr[j]) && (i != j))
                {
                    list.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }    
}
