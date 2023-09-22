import java.util.*;

class StructureRhombus
{
    public static void main(String args[])
    {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = console.nextInt();

        String choice = "Y";
        while(choice=="Y")
        {
            for(int i=0;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }

            for(int i=n;i>=0;i--)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }

            System.out.print("Do you want to continue(Y/N): ");
            choice = console.next();

            if(choice=="N")
            break;
        }
        
    }
}
