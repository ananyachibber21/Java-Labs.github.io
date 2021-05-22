import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
        Scanner console = new Scanner(System.in);
        float add, sub, mult, div;
        System.out.print("Enter first number: ");
        float num1 = console.nextInt();
        System.out.print("Enter second number: ");
        float num2 = console.nextInt();
        
        add = num1+num2;
        System.out.println("Additon: "+ add);
        
        sub = num1-num2;
        System.out.println("Subtraction: "+ sub);
        
        mult = num1*num2;
        System.out.println("Multiplication "+ mult);
        
        div = num1/num2;
        System.out.println("Division "+ div);
	}
}
