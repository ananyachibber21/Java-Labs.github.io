import java.util.*;

class ConversionMinutes
{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minutes: ");
		int min = sc.nextInt();
		
		int days = min/(24*60);
		int months = min/(24*60*30);
		int years = min/(60*24*365);
		
		System.out.println("YY-MM-DD: "+ years +"-"+ months +"-"+ days);
    }
}
