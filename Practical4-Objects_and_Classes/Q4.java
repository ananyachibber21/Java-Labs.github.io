import java.util.*;

public class ComplexNumber{

   double real, img;
	
   ComplexNumber(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
	
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        return temp;
    }
    public static void main(String args[]) {
    	Scanner console = new Scanner(System.in);
	    System.out.println("Enter real part: ");
        double r1 = console.nextInt();
        System.out.println("Enter imaginary part: ");
        double i1 = console.nextInt();
        ComplexNumber c1 = new ComplexNumber(r1,i1);
		
		System.out.println("Enter real part: ");
        double r2 = console.nextInt();
        System.out.println("Enter imaginary part: ");
        double i2 = console.nextInt();
        ComplexNumber c2 = new ComplexNumber(r2,i2);
        ComplexNumber temp = sum(c1, c2);
        System.out.printf("Sum is: "+ temp.real+" + "+ temp.img +"i");
    }
}
