import java.util.*;

public class Complex{

   double real, img;
	
   Complex(double r, double i){
	this.real = r;
	this.img = i;
   }
	
   public static Complex sum(Complex c1, Complex c2)
   {
	
        Complex temp = new Complex(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        
        return temp;
    }

    public static Complex diff(Complex c1, Complex c2)
   {
	
        Complex temp1 = new Complex(0, 0);

        temp1.real = c1.real - c2.real;
        temp1.img = c1.img - c2.img;
        
        return temp1;
    }

    public static Complex mult(Complex c1, Complex c2)
   {
	
        Complex temp2 = new Complex(0, 0);

        temp2.real = c1.real * c2.real;
        temp2.img = c1.img * c2.img;
        
        return temp2;
    }

    public static void main(String args[]) {
    	Scanner console = new Scanner(System.in);
	    System.out.println("Enter real part: ");
        double r1 = console.nextInt();
        System.out.println("Enter imaginary part: ");
        double i1 = console.nextInt();
        Complex c1 = new Complex(r1,i1);
		
		System.out.println("Enter real part: ");
        double r2 = console.nextInt();
        System.out.println("Enter imaginary part: ");
        double i2 = console.nextInt();
        Complex c2 = new Complex(r2,i2);
        Complex temp = sum(c1, c2);
        Complex temp1 = diff(c1, c2);
        Complex temp2 = mult(c1, c2);
        System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
        System.out.println("Sum is: "+ temp1.real+" + "+ temp1.img +"i");
        System.out.println("Sum is: "+ temp2.real+" + "+ temp2.img +"i");
    }
}
