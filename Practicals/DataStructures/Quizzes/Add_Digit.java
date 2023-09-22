import java.util.Scanner;
import java.util.ArrayList;
class Add_Digit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        System.out.println("Enter a digit: ");
        int num = sc.nextInt();
        while(num>0){
            n = num % 10;
            sum=sum+n;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
