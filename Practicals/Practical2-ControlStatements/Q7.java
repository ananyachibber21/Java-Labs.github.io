import java.util.Scanner;
import java.lang.*;

class Find_Month
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);        
        boolean ch = true;
        do{
            System.out.println("Enter month number: ");
            int num = sc.nextInt();
            switch(num){
            case 1:
               System.out.println("January");
               break;

            case 2:
               System.out.println("February");
               break;

            case 3:
               System.out.println("March");
               break;

            case 4:
               System.out.println("April");
               break;

            case 5:
               System.out.println("May");
               break;

            case 6:
               System.out.println("June");
               break;

            case 7:
               System.out.println("July");
               break;

            case 8:
               System.out.println("August");
               break;

            case 9:
               System.out.println("September");
               break;

            case 10:
               System.out.println("October");
               break;

            case 11:
               System.out.println("November");
               break;

            case 12:
               System.out.println("December");
               break;

            default:
               System.out.println("Error. Try Again!");
               break;
            }
            System.out.println("Do you want to continue? (y/n): ");
            String z=sc.next();
	        char c=z.charAt(0);
	        if( c=='n'){
                ch=false;
            }	            
        }
        while(ch!=false);   
    }
}
