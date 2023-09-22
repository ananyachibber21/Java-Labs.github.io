import java.util.Scanner;

class Five_Digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 5-digit number: ");
        int num = sc.nextInt();
        if((num>10000) && (num<99999)){
            System.out.print(num/10000);
            System.out.print("   ");
            System.out.print((num/1000)%10);
            System.out.print("   ");
            System.out.print((num/100)%10);
            System.out.print("   ");
            System.out.print((num%100)/10);
            System.out.print("   ");
            System.out.print(num%10);

        }
        else{
            System.out.println("Error. The number should be a 5 digit no. Try again!");
        }
    }
}
