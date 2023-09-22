import java.util.Scanner;

class Ascii_value
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char val = sc.next().charAt(0);
        int ascii = val;
        System.out.println(ascii);
    }
}