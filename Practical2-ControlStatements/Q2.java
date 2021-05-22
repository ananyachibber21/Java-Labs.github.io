import java.util.*;
import java.lang.Math;

public class Quadratic {

	public static void main(String[] args) {
		Scanner console =  new Scanner(System.in);
		
		double result, root1, root2;
		System.out.print("Enter coefficient a: ");
		double a = console.nextDouble();
		System.out.print("Enter coefficient b: ");
	    double b = console.nextDouble();
		System.out.print("Enter coefficient c: ");
		double c = console.nextDouble();
		
		result = b * b - 4 * a * c;
		
		if(result >0) {
			root1 = (-b+Math.pow(result, 0.5))/(2*a);
			root2=(-b-Math.pow(result, 0.5))/(2*a);
			System.out.println("The roots are: "+ root1+","+root2);
		}
		
		else if(result==0) {
			root1=root2= -b/(2*a);
			System.out.println("The root is: "+ root1);
		}
		
		else {
			System.out.println("Imaginary Numbers");
		}
	}
}
