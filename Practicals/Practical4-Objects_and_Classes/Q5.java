import java.util.*;

class Distance
{
	double dis;

	Distance(double x1, double y1, double x2, double y2)
	{
		dis=(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
	}
}

public class DistancePoints
{

	public static void main(String args[])
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter x1: ");
		double x1 = console.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = console.nextDouble();
		
        System.out.println("Enter x2: ");
		double x2 = console.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = console.nextDouble();
		Distance d = new Distance(x1,y1,x2,y2);
		System.out.println("Distance: "+d.dis);
	}
}
